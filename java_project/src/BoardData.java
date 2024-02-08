
import java.time.LocalDate;
import java.util.Scanner;

// 클라이언트 측에서 진행하게 될 글의 데이터 관리.
public class BoardData{
	private String boardSubject;
	private String boardwriter;
	private String boardPostMain;
	private LocalDate boardDate; 
	
	public BoardData(String boardSubject, String boardwriter, String boardPostMain) {
		this.boardSubject = boardSubject;
		this.boardwriter = boardwriter;
		this.boardPostMain = boardPostMain;
		this.boardDate = LocalDate.now();
	}
	
	public String getBoardSubject() {
		return boardSubject;
	}

	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}

	public String getBoardwriter() {
		return boardwriter;
	}

	public void setBoardwriter(String boardwriter) {
		this.boardwriter = boardwriter;
	}

	public String getBoardPostMain() {
		return boardPostMain;
	}

	public void setBoardPostMain(String boardPostMain) {
		this.boardPostMain = boardPostMain;
	}

	public LocalDate getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(LocalDate boardDate) {
		this.boardDate = boardDate;
	}
}
