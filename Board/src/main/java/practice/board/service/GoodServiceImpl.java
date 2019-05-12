package practice.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import practice.board.dao.GoodDAO;

@Service("GoodService")
public class GoodServiceImpl implements GoodService {
	
	@Autowired
	@Qualifier("GoodDAO")
	GoodDAO dao;

	@Override
	public void goodRegister(int boardpid, int personpid) {
		dao.goodRegister(boardpid, personpid);
		return;
	}

	@Override
	public void goodDelete(int boardpid, int personpid) {
		dao.goodDelete(boardpid, personpid);
		return;
	}

}
