package practice.board.vo;

import java.util.Date;

public class CommentVO {
	int commentpid;
	int boardpid;
	int personpid;
	String content;
	Date date;
	
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
	
	@Override
	public String toString() {
		return "Comment [commentpid=" + commentpid + ", boardpid=" + boardpid + ", personpid=" + personpid
				+ ", content=" + content + ", date=" + date + "]";
	}
	
	
	
}
