package s.sun.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

import s.sun.data.BoardData;
import s.sun.pages.BoardPages;


// 데이터 처리를 진행하는 쓰레드. 
public class ClientInputOutput implements Runnable{
	// 소켓
	private Socket socket;
	// 게시글  
	private BoardData post;
	// 게시글 리스트들
	private ArrayList<BoardData> postList;
	// UI 호출에 관여하는 문자열 배열
	private String[] pageNames = {"전체 목록","내 작성 목록","게시글 작성","게시글 수정","게시글 삭제"};
	// UI 호출을 원활하게 하기 위한 ArrayList
	private ArrayList<String> calledPage = new ArrayList<String>(Arrays.asList(pageNames));	

	// input, output 작업을 위해 소켓을 받아오는 생성자.
	public ClientInputOutput(Socket socket) {
		this.socket = socket;
	} 
		
	// 서버에서 받는 게시글이나, 게시글 리스트를 리턴하는 메서드를 제네릭으로 한다면? 
	private synchronized <T> ArrayList<T> readData(ObjectInputStream in) throws IOException, ClassNotFoundException {
	    Object obj = in.readObject();
	    if (obj instanceof ArrayList<?>) {
	        return (ArrayList<T>) obj;
	    } else {
	        ArrayList<T> list = new ArrayList<>();
	        T readobj = (T) obj;
	        list.add(readobj);
	        return list;
	    }
	}	
	
	private synchronized void sendData(ObjectOutputStream out) {
		
	}

	@Override
	public void run() {
		try {
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			
			// 어떤 객체가 오든 ArrayList<BoardData>로 변환하는 메서드 사용. 
			postList = readData(in);
			
            // 서버로부터 받은 게시글 출력
			BoardPages boardPages = new BoardPages(postList);
			// 현재 페이지를 나타내는 문자열
			String whatPage = boardPages.getThisPage();
			if(whatPage.equals(calledPage.get(0))){
				boardPages.mainPage();
			}else if(whatPage.equals(calledPage.get(1))){
				
			}
	            // 서버로 게시글 전송				
			sendData(out);

            // 사용 후에는 스트림을 닫아줍니다.
            in.close();
            out.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
