package practice.board.dto;

import java.util.Date;

public class BoardInfoDTO {
	private String title;
	private String content;
	private Date date;
	private int goodcount;
	private boolean good;
	
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
	public int getGoodcount() {
		return goodcount;
	}
	public void setGoodcount(int goodcount) {
		this.goodcount = goodcount;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
	
	@Override
	public String toString() {
		return "BoardInfoDTO [title=" + title + ", content=" + content + ", date=" + date + ", goodcount=" + goodcount
				+ ", good=" + good + "]";
	}
	
}
