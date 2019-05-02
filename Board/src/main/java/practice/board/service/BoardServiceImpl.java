package practice.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import practice.board.dao.BoardDAO;
import practice.board.dto.Board;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	@Qualifier("BoardDAO")
	private BoardDAO dao;

	@Override
	public void boardRegiser(Board board) throws Exception {
		dao.boardRegister(board);
		return;
	}

	@Override
	public Board boardInfo(int boardpid) throws Exception {
		return dao.boardInfo(boardpid);
	}

}
