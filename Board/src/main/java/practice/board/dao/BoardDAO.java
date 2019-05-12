package practice.board.dao;

import practice.board.dto.BoardInfoDTO;
import practice.board.vo.BoardVO;;

public interface BoardDAO {
	
	public void boardRegister(BoardVO board) throws Exception;
	
	public BoardInfoDTO boardInfo(int boardpid,int personpid) throws Exception;
	
	public void boardDelete(int boardpid) throws Exception;
}
