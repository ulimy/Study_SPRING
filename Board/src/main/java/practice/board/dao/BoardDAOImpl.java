package practice.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import practice.board.dto.BoardInfoDTO;
import practice.board.vo.BoardVO;

@Repository("BoardDAO")
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private Mapper mapper;
	
	@Override
	public void boardRegister(BoardVO board) throws Exception {
		mapper.boardRegister(board);
		return;

	}

	@Override
	public BoardInfoDTO boardInfo(int boardpid,int personpid) throws Exception {
		return mapper.boardInfo(boardpid,personpid);
	}
	
	@Override
	public void boardDelete(int boardpid) throws Exception {
		mapper.boardDelete(boardpid);
		return;
	}

}
