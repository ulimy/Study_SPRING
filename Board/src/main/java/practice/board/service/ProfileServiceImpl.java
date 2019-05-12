package practice.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import practice.board.dao.ProfileDAO;
import practice.board.vo.ProfileVO;

@Service("ProfileService")
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	@Qualifier("ProfileDAO")
	ProfileDAO dao;

	@Override
	public int login(ProfileVO profile) {
		return dao.login(profile.getId(), profile.getPassword());
	}

}
