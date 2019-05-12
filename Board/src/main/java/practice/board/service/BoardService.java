package practice.board.service;

import org.json.simple.JSONArray;

import practice.board.vo.BoardVO;

public interface BoardService {
	
	public void boardRegiser(BoardVO board) throws Exception;
	
	public JSONArray boardInfo(int boardpid,int personpid) throws Exception;
	
	public void boardDelete(int boardpid) throws Exception;
}
