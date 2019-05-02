package practice.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practice.board.dto.Comment;

@Component("CommentDAO")
public class CommentDAOImpl implements CommentDAO {
	
	@Autowired
	private Mapper mapper;

	@Override
	public void commentRegister(Comment comment) throws Exception {
		mapper.commentRegister(comment);
		return;
	}

	@Override
	public Comment[] commentInfo(int boardpid) throws Exception {
		return mapper.commentInfo(boardpid);
	}

}
