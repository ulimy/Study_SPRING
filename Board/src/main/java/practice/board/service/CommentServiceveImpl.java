package practice.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import practice.board.dao.CommentDAO;
import practice.board.vo.CommentVO;

@Service("CommentService")
public class CommentServiceveImpl implements CommentService {
	
	@Autowired
	@Qualifier("CommentDAO")
	private CommentDAO dao;

	@Override
	public void commentRegister(CommentVO comment) throws Exception{
		
		dao.commentRegister(comment);
		return;
	}
	
	@Override
	public void commentDelete(int commentpid) throws Exception{
		dao.commentDelete(commentpid);
		return;
	}

}
