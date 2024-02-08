import java.util.ArrayList;
import java.util.Scanner;

public class BoardMyPage{
	private ArrayList<BoardData> listMain;
	
	public BoardMyPage(ArrayList<BoardData> listMain) {
		this.listMain = listMain;
	}
	
	public void myPage() {
		Scanner sc = new Scanner(System.in); // 입력받기
		
		System.out.println("-------------------------------------------------------");	
		System.out.println("  |  내 게시글 번호   | 내 게시글 제목    |  게시글 내용   | 게시글 작성자  |");
		
								//	13    | 	13    |   13	 |   10
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
		System.out.println("  | 1. 전체 목록 | 2. 게시글 작성 | 3. 게시글 수정 | 4. 게시글 삭제 | ");
		
		System.out.print("클릭할 영역 : ");
		String enterString = sc.next();
		switch(enterString) {
		case "1" :
			
			sc.close();
			break;
		case "2" : 
			
			sc.close();
			break;
		case "3" : 
			
			sc.close();
			break;
		case "4" : 
			
			sc.close();
			break;
		}
	}
}
