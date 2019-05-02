package practice.board.service;

import practice.board.dto.Board;

public interface BoardService {
	
	public void boardRegiser(Board board) throws Exception;
	
	public Board boardInfo(int boardpid) throws Exception;
}
