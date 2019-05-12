package practice.board.service;

import practice.board.vo.ProfileVO;

public interface ProfileService {

	public int login(ProfileVO profile);
	
	public void signup(ProfileVO profile);
	
}
