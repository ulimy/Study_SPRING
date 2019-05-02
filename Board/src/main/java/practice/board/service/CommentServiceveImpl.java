package practice.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import practice.board.dao.CommentDAO;
import practice.board.dto.Comment;

@Service("CommentService")
public class CommentServiceveImpl implements CommentService {
	
	@Autowired
	@Qualifier("CommentDAO")
	private CommentDAO dao;

	@Override
	public void commentRegister(Comment comment) throws Exception{
		
		dao.commentRegister(comment);
		return;
	}

	@Override
	public Comment[] commentInfo(int boardpid) throws Exception {
		
		return dao.commentInfo(boardpid);
	}

}
