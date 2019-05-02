package practice.board.dao;

import practice.board.dto.Board;

public interface BoardDAO {
	
	public void boardRegister(Board board) throws Exception;
	
	public Board boardInfo(int boardpid) throws Exception;
}
