package practice.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practice.board.dto.Board;

@Component("BoardDAO")
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private Mapper mapper;
	
	@Override
	public void boardRegister(Board board) throws Exception {
		mapper.boardRegister(board);
		return;

	}

	@Override
	public Board boardInfo(int boardpid) throws Exception {
		return mapper.boardInfo(boardpid);
	}
	
	@Override
	public void boardDelete(int boardpid) throws Exception {
		mapper.boardDelete(boardpid);
		return;
	}

}
