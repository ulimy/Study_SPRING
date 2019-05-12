package practice.board.dao;

import org.apache.ibatis.annotations.Param;

import practice.board.dto.BoardInfoDTO;
import practice.board.vo.BoardVO;
import practice.board.vo.CommentVO;

public interface Mapper {

	public void boardRegister(BoardVO board);
	
	public BoardInfoDTO boardInfo(@Param("boardpid")int boardpid,@Param("personpid")int personpid);
	
	public void boardDelete(int boardpid);
	
	public void commentRegister(CommentVO comment);
	
	public CommentVO[] commentInfo(int boardpid);
	
	public void commentDelete(int commentpid);

}
