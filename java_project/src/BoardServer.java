import java.net.ServerSocket;
import java.net.Socket;

public class BoardServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; 
		// 서버 소켓
		Socket socket = null;
		// 유저 소켓
		
		try {
			serverSocket = new ServerSocket(7777);
			// 포트 번호는 개발자 마음.
			System.out.println("서버가 작동되었습니다.");
			
			socket = serverSocket.accept();
			// 유저 소켓에서 데이터를 보낼 때까지 기다린다. 
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
