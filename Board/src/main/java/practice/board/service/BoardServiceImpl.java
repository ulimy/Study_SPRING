package practice.board.service;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import practice.board.dao.BoardDAO;
import practice.board.dao.CommentDAO;
import practice.board.dto.Board;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	@Qualifier("BoardDAO")
	private BoardDAO BoardDao;
	
	@Autowired()
	@Qualifier("CommentDAO")
	private CommentDAO CommentDao;

	@Override
	public void boardRegiser(Board board) throws Exception {
		BoardDao.boardRegister(board);
		return;
	}

	@Override
	public JSONArray boardInfo(int boardpid) throws Exception {
		JSONArray result = new JSONArray();
		result.add(BoardDao.boardInfo(boardpid));
		result.add(CommentDao.commentInfo(boardpid));
		return result;
	}

}
