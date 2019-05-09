package practice.board.service;

import org.json.simple.JSONArray;

import practice.board.dto.Board;

public interface BoardService {
	
	public void boardRegiser(Board board) throws Exception;
	
	public JSONArray boardInfo(int boardpid) throws Exception;
	
	public void boardDelete(int boardpid) throws Exception;
}
