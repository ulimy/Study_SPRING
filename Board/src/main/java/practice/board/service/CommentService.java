package practice.board.service;

import practice.board.vo.CommentVO;

public interface CommentService {
	
	public void commentRegister(CommentVO comment) throws Exception;
	
	public void commentDelete(int commnetpid) throws Exception;
}
