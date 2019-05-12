package practice.board.dao;

public interface ProfileDAO {
	
	public int login(String id, String password);
	
	public void signup(String id, String password);
	
}
