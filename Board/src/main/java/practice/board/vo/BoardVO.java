package practice.board.vo;

import java.util.Date;

public class BoardVO {
	
	private int boardpid;
	private int personpid;
	private String title;
	private String content;
	private Date date;
	
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
	
	@Override
	public String toString() {
		return "BoardVO [boardpid=" + boardpid + ", personpid=" + personpid + ", title=" + title + ", content="
				+ content + ", date=" + date + "]";
	}

	

	
}
