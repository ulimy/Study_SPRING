package practice.board.service;

import practice.board.dto.Comment;

public interface CommentService {
	
	public void commentRegister(Comment comment) throws Exception;
	
	public Comment[] commentInfo(int boardpid) throws Exception;
	
	public void commentDelete(int commnetpid) throws Exception;
}
