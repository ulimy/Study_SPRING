package practice.board.dao;

import practice.board.dto.Comment;

public interface CommentDAO {
	
	public void commentRegister(Comment comment) throws Exception;
	
	public Comment[] commentInfo(int boardpid) throws Exception;
}
