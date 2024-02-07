import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class BoardSender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	public BoardSender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" +socket.getInetAddress() + "." + socket.getPort()+ "]";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (Exception e) {
				scanner.close();
				e.printStackTrace();
			}
		}
		
	}
}
