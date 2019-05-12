package practice.board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ProfileDAO")
public class ProfileDAOImpl implements ProfileDAO {
	
	@Autowired
	Mapper mapper;

	@Override
	public int login(String id, String password) {
		return mapper.login(id, password);	
	}
	
	@Override
	public void signup(String id, String password){
		mapper.signup(id, password);
		return;
	}
	
}
