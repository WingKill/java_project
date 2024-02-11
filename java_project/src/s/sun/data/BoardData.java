package s.sun.data;

import java.io.Serializable;
import java.time.LocalDate;

// 클라이언트 측에서 작성하는 글의 데이터 관리.
// 서버 측에서도 동일한 객체를 구현하여 보관하는 방식
// Seriallizble을 하면 보관이 된다고 한다. 결국, 이건 보여주는 객체가 아니라 보관객체가 되는 것.
public class BoardData implements Serializable{
	private String boardSubject; // 제목
	private String boardwriter; // 작성자
	private String boardContent; // 내용
	private LocalDate boardDate; // 작성 날짜 - 작업 유형을 구분하는 기준. 입력, 수정에 한정.
	
	
	public BoardData(String boardSubject, String boardwriter, String boardContent) {
		this.boardSubject = boardSubject;
		this.boardwriter = boardwriter;
		this.boardContent = boardContent;
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

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public LocalDate getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(LocalDate boardDate) {
		this.boardDate = boardDate;
	}
}
