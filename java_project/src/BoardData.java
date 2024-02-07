
import java.time.LocalDate;
import java.util.Scanner;

// 작성, 수정, 삭제 담당. 근데 데이터 보관은 아닌거 같은데... 분리해야겠다 나중에
public class BoardData{
	private String boardSubject;
	private String boardwriter;
	private String boardPostMain;
	private LocalDate boardDate;
	
	Scanner sc = new Scanner(System.in);
	
	// 생성하기.
	public BoardData() {
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
		String chooseNum = sc.next();
		if(chooseNum == "1") {
			this.boardSubject = boardSubject;
			this.boardwriter = boardwriter;
			this.boardPostMain = boardPostMain;
			this.boardDate = LocalDate.now();
			sc.close();
			BoardMainPage mainPage = new BoardMainPage();
		}else {
			System.out.println("메인 화면으로 돌아갑니다.");
			sc.close();
			BoardMainPage mainPage = new BoardMainPage();
		}		
		
	}
	
	public void editPost(String boardwriter) {
		if(this.boardwriter.equals(boardwriter)) {
			System.out.println("-----------------------------");
			System.out.println("작성자  : " + boardwriter);
			System.out.println("-----------------------------");
			System.out.print("게시글 제목 : " );
			String editSubject = sc.next();
			System.out.println("-----------------------------");
			System.out.print("게시글 내용 : ");
			String editPostMain = sc.nextLine();
			System.out.println("-----------------------------");
			System.out.println("| 1. 수정 | 2. 취소 |");
			System.out.print("입력되는 값(1,2 중 하나) : ");
			String chooseNum = sc.next();
		}else {
			System.out.println("정상적인 접근이 아닙니다. 메인 화면으로 돌아갑니다.");
			BoardMainPage mainPage = new BoardMainPage();
			return;
		}
	}
	
	public void deletePost() {
		
	}
}
