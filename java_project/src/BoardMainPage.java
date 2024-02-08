import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardMainPage{
	private ArrayList<BoardData> listMain;
	private Socket socket;
	
	public BoardMainPage(Socket socket) {
		this.socket = socket;
		// 객체 가져와서 대입하는 과정 수록하기
		// this.listMain = ;
	}
	
	public void mainPage() {
		Scanner sc = new Scanner(System.in); // 입력받기

		System.out.println("-------------------------------------------------------");
		System.out.println("  |  전체 번호   | 게시글 제목    |  게시글 내용   | 게시글 작성자  |");
		for(BoardData post : listMain) {
			System.out.println();
		}
		// 10 | 13 | 13 | 10
		// 전체 목록, 게시글 작성자를 제외하고 각각 5를 뺀 숫자를 초과하면 나머지 부분은 ...으로 표시
		// 전체 목록은 수치로 표시		
		System.out.println("-------------------------------------------------------");
		// 변수를 넣을 자리 구분해놓음
		if (true) {
			System.out.println("  |         |             |          |          |");
		} else {
			System.out.println("  |" + "|" + "|" + "|" + "|");
		}

		System.out.println("-------------------------------------------------------");
		System.out.println("              | 1. 내 게시글 목록 | 2. 게시글 작성 | ");

		System.out.print("선택할 영역(1,2 중 하나) : ");
		String enterString = sc.next();
		if (enterString == "1") {
			System.out.println("-----------------------ㅡMY PAGE-----------------------");
			BoardMyPage myPage = new BoardMyPage(listMain);
			myPage.myPage();
		} else if (enterString == "2") {
			BoardClientWritePage writePage = new BoardClientWritePage();
			writePage.newWriteScreen(socket);
		} else {

		}
	}
	
}
