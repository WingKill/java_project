import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMainPage {
	private List<BoardData> listMain = new ArrayList<BoardData>();
	public BoardMainPage() {
		Scanner sc = new Scanner(System.in); // 입력받기
		
		System.out.println("-------------------------------------------------------");	
		System.out.println("  |  전체 목록   | 게시글 제목    |  게시글 내용   | 게시글 작성자  |");
								//	10    | 	13    |   13	 |   10
								// 전체 목록, 게시글 작성자를 제외하고 각각 5를 뺀 숫자를 초과하면 나머지 부분은 ...으로 표시
								// 전체 목록은 수치로 표시
		System.out.println("-------------------------------------------------------");
		// 변수를 넣을 자리 구분해놓음
		if(true) {
			System.out.println("  |         |             |          |          |" );
		}else {
			System.out.println("  |"+
					"|"+
					"|"+
					"|"+
					"|" );
		}		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("              | 1. 내 게시글 목록 | 2. 게시글 작성 | ");
		
		System.out.print("선택할 영역(1,2 중 하나) : ");
		String enterString = sc.next();
		if(enterString == "1") {
			System.out.println("-----------------------ㅡMY PAGE-----------------------");
			BoardMyPage myPage = new BoardMyPage();
		}else if(enterString == "2") {
			
		}else {
			
			
		}
	}
	
	private void returnMainPage() {
		
		System.out.println("잘못 입력하셨습니다. 메인 페이지로 다시 연결합니다.");
		System.out.println("----------------------restart------------------------");
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력받기
		
		System.out.println("-------------------------------------------------------");	
		System.out.println("  |  전체 목록   | 게시글 제목    |  게시글 내용   | 게시글 작성자  |");
								//	10    | 	13    |   13	 |   10
								// 전체 목록, 게시글 작성자를 제외하고 각각 5를 뺀 숫자를 초과하면 나머지 부분은 ...으로 표시
								// 전체 목록은 수치로 표시
		System.out.println("-------------------------------------------------------");
		// 변수를 넣을 자리 구분해놓음
		if(true) {
			System.out.println("  |         |             |          |          |" );
		}else {
			System.out.println("  |"+
					"|"+
					"|"+
					"|"+
					"|" );
		}		
		
		System.out.println("-------------------------------------------------------");
		System.out.println("              | 1. 내 게시글 목록 | 2. 게시글 작성 | ");
		
		System.out.print("선택할 영역(1,2 중 하나) : ");
		String enterString = sc.next();
		
	}
}
