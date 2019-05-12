package practice.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import practice.board.dto.CommentDTO;
import practice.board.vo.CommentVO;

@Repository("CommentDAO")
public class CommentDAOImpl implements CommentDAO {
	
	@Autowired
	private Mapper mapper;

	@Override
	public void commentRegister(CommentVO comment) throws Exception {
		mapper.commentRegister(comment);
		return;
	}

	@Override
	public CommentDTO[] commentInfo(int boardpid) throws Exception {
		return mapper.commentInfo(boardpid);
	}

	@Override
	public void commentDelete(int commentpid) throws Exception{
		mapper.commentDelete(commentpid);
		return;
	}
}
