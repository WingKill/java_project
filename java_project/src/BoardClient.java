
import java.net.Socket;

import s.sun.client.ClientInputOutput;

public class BoardClient {
	public static void main(String[] args) {
		Socket socket = null;
		// 유저 소켓	
		try {
			socket = new Socket("localhost", 7777);
			// 컴퓨터 내 7777 프로그램에 접근			
			System.out.println("서버에 연결되었습니다.");
			ClientInputOutput client = new ClientInputOutput(socket);	
			client.run();
			
			socket.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
