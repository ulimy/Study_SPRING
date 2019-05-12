package practice.board.dto;

import java.util.Date;

public class BoardListDTO {
	private int boardpid;
	private String title;
	private String content;
	private Date date;
	private int likecount;
	private boolean like;
	
	public int getBoardpid() {
		return boardpid;
	}
	
	public void setBoardpid(int boardpid) {
		this.boardpid = boardpid;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	
}
