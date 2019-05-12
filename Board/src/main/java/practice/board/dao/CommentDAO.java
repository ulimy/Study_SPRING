package practice.board.dao;

import practice.board.dto.CommentDTO;
import practice.board.vo.CommentVO;

public interface CommentDAO {
	
	public void commentRegister(CommentVO comment) throws Exception;
	
	public CommentDTO[] commentInfo(int boardpid) throws Exception;
	
	public void commentDelete(int commentpid) throws Exception;
}
