import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import s.sun.data.BoardData;

public class BoardServer {

	public static void main(String[] args) {
		// 서버 소켓
		ServerSocket serverSocket = null; 
		// 유저 소켓		
		Socket socket = null;
		// 서버에 보관할 모든 게시글 데이터리스트 
		// 아직 데이터베이스에 저장하지 않는 상태. 서버가 꺼지면, 저장되지 않는 상태가 된다.
		ArrayList<BoardData> BoardListAll = new ArrayList<>();
		
		try {
			serverSocket = new ServerSocket(7777);
			// 포트 번호는 개발자 마음.
			System.out.println("서버가 작동되었습니다.");
			while(true) {
				// 유저 소켓에서 데이터를 보낼 때까지 기다린다. 
				socket = serverSocket.accept();
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
