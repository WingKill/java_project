package s.sun.pages;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import s.sun.data.BoardData;

public class BoardPages {
	private ArrayList<BoardData> boardlist;
	// 페이지 상태를 나타내는 문자열
	private String thisPage = "전체 목록";
	// UI 호출에 관여하는 문자열 배열
	private String[] pageNames = {"전체 목록","내 작성 목록","게시글 작성","게시글 수정","게시글 삭제"};
	Scanner sc = new Scanner(System.in);	
	
	// '쓰레드로 전달된 객체'를 전달받는 생성자. 
	public BoardPages(ArrayList<BoardData> boardlist) {
		this.boardlist = boardlist;
	}
	
	public void mainPage() {
		System.out.println("-------------------------------------------------------");
		System.out.println("  |  전체 번호   | 게시글 제목    |  게시글 내용   | 게시글 작성자  |");	
		System.out.println("-------------------------------------------------------");
		if (boardlist == null) { // 서버에 데이터가 없는 경우.
			System.out.println("  |         |            |          |          |");
		} else { // 데이터가 있는 경우.
			for(BoardData post : boardlist) {
				System.out.println("  |"+boardlist.indexOf(post) + 
								 	 "|" + post.getBoardSubject() + 
									 "|" + post.getBoardContent() + 
									 "|" + post.getBoardwriter()  + "|");
			}
		}

		System.out.println("-------------------------------------------------------");
		System.out.println("              | 1. 내 게시글 목록 | 2. 게시글 작성 | ");

		System.out.println("선택할 영역(1,2 중 하나) : ");
		String enterString = sc.next();
		if (enterString == "1") {
			thisPage = pageNames[1];
		} else if (enterString == "2") {
			thisPage = pageNames[2];
		} else {
			int count = 0;
			System.out.println("잘못 입력하셨습니다. 메인 화면으로 되돌아갑니다.");
			return;
		}
	}
	
	public void myPage(ArrayList<BoardData> boardlist) {
		System.out.println("-------------------------MY PAGE-----------------------");
		System.out.println("-------------------------------------------------------");	
		System.out.println("  |  내 게시글 번호   | 내 게시글 제목    |  게시글 내용   | 게시글 작성자  |");
		if (boardlist == null) { // 서버에 데이터가 없는 경우.
			System.out.println("  |         |            |          |          |");
		} else { // 데이터가 있는 경우.
			for(BoardData post : boardlist) {
				System.out.println("  |"+boardlist.indexOf(post) + 
								 	 "|" + post.getBoardSubject() + 
									 "|" + post.getBoardContent() + 
									 "|" + post.getBoardwriter()  + "|");
			}
		}
		System.out.println("-------------------------------------------------------");			
		System.out.println("-------------------------------------------------------");
		System.out.println("  | 1. 전체 목록 | 2. 게시글 작성 | 3. 게시글 수정 | 4. 게시글 삭제 | ");
		
		System.out.println("선택할 영역(1,2,3,4 중 하나) : ");
		String enterString = sc.next();
		switch(enterString) {
		case "1" :
			
			
			break;
		case "2" : 
			
			
			break;
		case "3" : 
			
			
			break;
		case "4" : 
			
			
			break;
		}
	}
	
	public void newWritePage(ArrayList<BoardData> boardlist) {
		System.out.println("-----------------------------");
		System.out.println("작성자  : ");
		String boardwriter = sc.next(); 
		System.out.println("-----------------------------");
		System.out.print("게시글 제목 : " );
		String boardSubject = sc.next();
		System.out.println("-----------------------------");
		System.out.print("게시글 내용 : ");
		String boardContent = sc.nextLine();
		System.out.println("-----------------------------");
		System.out.println("| 1. 작성 | 2. 취소 |");
		System.out.println("-----------------------------");
		System.out.println("선택할 영역(1,2 중 하나) : ");
		int chooseNum = sc.nextInt();
		BoardData newpost = new BoardData(boardSubject, boardwriter, boardContent);
		if(chooseNum == 1) {
			
		}
		
	}
	
	public void editPage(ArrayList<BoardData> boardlist) {	
		BoardData getpost = boardlist.get(0);
		System.out.println("--------이전 게시물 내용---------");
		System.out.println("작성자  : " + getpost.getBoardwriter());// socket에서 가져온 데이터와 비교하는 과정 담기
		System.out.println("-----------------------------");
		System.out.print("게시글 제목 : " + getpost.getBoardSubject());
		System.out.println("-----------------------------");
		System.out.print("게시글 내용 : " + getpost.getBoardContent());
		System.out.println("-----------------------------");
		System.out.println("--------새로 작성할 내용----------");
		System.out.println("-----------------------------");
		System.out.println("작성자  : " + getpost.getBoardwriter());// socket에서 가져온 데이터와 비교하는 과정 담기
		System.out.println("-----------------------------");
		System.out.print("게시글 제목 : " );
		String editSubject = sc.next();
		System.out.println("-----------------------------");
		System.out.print("게시글 내용 : ");
		String editBoardContent = sc.nextLine();
		System.out.println("| 1. 수정 | 2. 취소 |");
		System.out.println("선택할 영역(1,2 중 하나) : ");
		int chooseNum = sc.nextInt();
		BoardData editpost = new BoardData(editSubject, getpost.getBoardwriter(), editBoardContent);
		if(chooseNum == 1 && isEditPosting(getpost,editpost)) {
			boardlist.remove(0);
			boardlist.add(editpost);
		}
	}
	// 수정 내용인가?
	public boolean isEditPosting(BoardData getpost, BoardData editpost) {
		if(!(getpost.getBoardDate().equals(editpost.getBoardDate())) &&
				getpost.getBoardwriter().equals(editpost.getBoardwriter()))
			return true;
		else
			return false;		
	}
	
	public void deletePage(ArrayList<BoardData> boardlist) {		
		System.out.println("-----------------------------");
		System.out.println("해당 게시글을 삭제하시겠습니까?");
		System.out.println("-----------------------------");
		System.out.println("1. 확인 | 2. 취소");
		System.out.println("선택할 영역(1,2 중 하나) : ");
		String enterString = sc.next();
	}
	
	// 현재 페이지 이름 반환
	public String getThisPage() {
		return thisPage;
	}
	
	// 페이지 이름 세팅하기
	public void setThisPage(String thisPage) {
		this.thisPage = thisPage;
	}
}
