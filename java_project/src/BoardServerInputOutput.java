import java.util.ArrayList;

import s.sun.data.BoardData;

//  서버에서 진행하는 작업. 이걸 쓰레드로 쓰면 되겠다.
public class BoardServerInputOutput implements Runnable{
	private ArrayList<BoardData> posts;
	private String name = "전체 목록";
	
	// BoardData를 담는 게시판 생성
	public BoardServerInputOutput() {
		this.posts = new ArrayList<BoardData>();
	}
	
	// 클라이언트에서 게시물을 받아 보여주기.
	public void addPost(BoardData post) {
		posts.add(post);
	}
	
	// 전체 목록 보여주기
	public ArrayList<BoardData> getAllPosts(){
		return posts;
	}
	
	// 게시판에서 작성한 내 게시물 보여주기.
	public ArrayList<BoardData> getMyPosts(){
		// 내 게시물 목록을 보여주기 위한 리스트
		ArrayList<BoardData> myPosts = new ArrayList<BoardData>();
		
		for(BoardData post : posts) {
			myPosts.add(post);
		}
		return myPosts;
	}
	
	@Override
	public void run() {
		
		
	}
}
