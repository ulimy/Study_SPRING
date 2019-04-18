package ulim.board.dao;

import java.util.Date;

public class Comment {
	private int commentpid;
	private int boardpid;
	private int personpid;
	private String content;
	private Date date;
	public int getCommentpid() {
		return commentpid;
	}
	public void setCommentpid(int commentpid) {
		this.commentpid = commentpid;
	}
	public int getBoardpid() {
		return boardpid;
	}
	public void setBoardpid(int boardpid) {
		this.boardpid = boardpid;
	}
	public int getPersonpid() {
		return personpid;
	}
	public void setPersonpid(int personpid) {
		this.personpid = personpid;
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
