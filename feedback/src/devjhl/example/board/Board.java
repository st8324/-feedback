package devjhl.example.board;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import lombok.Data;

@Data
public class Board implements Serializable{
	private static int boardNum = 0; // 게시글 번호
	private int num;
	private String title; // 제목
	private String contents; // 내용
	private int views; // 조회수
	private Date date;
	/**게시글은 회원 정보 전체가 아닌 아이디만 있으면 됩니다.*/
	private Member member; // 게시판은 멤버 정보를 가지고있다.
	private Category category; // 게시글 종류
	
	public Board(String title, String contents, Member member) {
		this.title = title;
		this.contents = contents;
		date = new Date();
		++boardNum;
		num = boardNum;
		this.views = 0;
		this.member = member;
	}
	
	public void addCategory(Category category) {
		this.category = category;
	}
	
	public void updateViews() {
		views++;
	}
	/**매개변수 오타*/
	public void update(String title, String content) {
		this.title = title;
		this.contents = contents;
	}
	
}
