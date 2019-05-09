package practice.board.dao;

import practice.board.dto.Board;
import practice.board.dto.Comment;

public interface Mapper {

	public void boardRegister(Board board);
	
	public Board boardInfo(int boardpid);
	
	public void boardDelete(int boardpid);
	
	public void commentRegister(Comment comment);
	
	public Comment[] commentInfo(int boardpid);
	
	public void commentDelete(int commentpid);

}
