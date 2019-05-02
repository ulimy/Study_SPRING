package practice.board.dao;

import practice.board.dto.Board;

public interface Mapper {

	public void boardRegister(Board board);
	
	public Board boardInfo(int boardpid);
}
