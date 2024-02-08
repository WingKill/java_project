import java.net.Socket;
import java.util.Scanner;

// 클라이언트가 작성하는 글 화면
public class BoardClientWritePage {
	Scanner sc = new Scanner(System.in);
	public void newWriteScreen(Socket socket) {
		System.out.println("-----------------------------");
		System.out.println("작성자  : ");
		String boardwriter = sc.next(); 
		System.out.println("-----------------------------");
		System.out.print("게시글 제목 : " );
		String boardSubject = sc.next();
		System.out.println("-----------------------------");
		System.out.print("게시글 내용 : ");
		String boardPostMain = sc.nextLine();
		System.out.println("-----------------------------");
		System.out.println("| 1. 작성 | 2. 취소 |");
		System.out.println("-----------------------------");
		System.out.print("입력되는 값(1,2 중 하나) : ");
		int chooseNum = sc.nextInt();
		if(chooseNum == 1) {
			BoardData newpost = new BoardData(boardSubject, boardwriter, boardPostMain); 
			// 소켓에 담아 전달하는 과정 담기
			sc.close();
		}else {
			System.out.println("메인 화면으로 돌아갑니다.");
			BoardMainPage mainpage = new BoardMainPage(socket);
			mainpage.mainPage();
			sc.close();
		}		
	}
	
	public void editScreen(Socket socket) {		
		System.out.println("-----------------------------");
		System.out.println("작성자  : " + "");// socket에서 가져온 데이터와 비교하는 과정 담기
		System.out.println("-----------------------------");
		System.out.print("게시글 제목 : " );
		String editSubject = sc.next();
		System.out.println("-----------------------------");
		System.out.print("게시글 내용 : ");
		String editPostMain = sc.nextLine();
		System.out.println("-----------------------------");
		System.out.println("| 1. 수정 | 2. 취소 |");
		System.out.print("입력되는 값(1,2 중 하나) : ");
		int chooseNum = sc.nextInt();
	}
}
