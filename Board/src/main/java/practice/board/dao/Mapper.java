package practice.board.dao;

import practice.board.dto.Board;
import practice.board.dto.Comment;

public interface Mapper {

	public void boardRegister(Board board);
	
	public Board boardInfo(int boardpid);
	
	public void commentRegister(Comment comment);
	
	public Comment[] commentInfo(int boardpid);
}
