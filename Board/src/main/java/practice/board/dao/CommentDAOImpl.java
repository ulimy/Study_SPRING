package practice.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practice.board.vo.CommentVO;

@Component("CommentDAO")
public class CommentDAOImpl implements CommentDAO {
	
	@Autowired
	private Mapper mapper;

	@Override
	public void commentRegister(CommentVO comment) throws Exception {
		mapper.commentRegister(comment);
		return;
	}

	@Override
	public CommentVO[] commentInfo(int boardpid) throws Exception {
		return mapper.commentInfo(boardpid);
	}

	@Override
	public void commentDelete(int commentpid) throws Exception{
		mapper.commentDelete(commentpid);
		return;
	}
}
