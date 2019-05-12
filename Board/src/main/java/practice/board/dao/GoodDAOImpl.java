package practice.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("GoodDAO")
public class GoodDAOImpl implements GoodDAO {
	
	@Autowired
	Mapper mapper;

	@Override
	public void goodRegister(int boardpid, int personpid) {
		mapper.goodRegister(boardpid,personpid);
		return;
	}

	@Override
	public void goodDelete(int boardpid, int personpid) {
		mapper.goodDelete(boardpid, personpid);
		return;
	}

}
