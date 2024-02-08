import java.util.ArrayList;

//  서버가 가지고 있을 작성 게시글 데이터.
public class BoardServerData {
	private ArrayList<BoardData> posts;
	private String name = "전체 목록";
	
	// BoardData를 담는 게시판 생성
	public BoardServerData() {
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
}
