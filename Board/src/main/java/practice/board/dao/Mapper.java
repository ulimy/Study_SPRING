package practice.board.dao;

import org.apache.ibatis.annotations.Param;

import practice.board.dto.BoardInfoDTO;
import practice.board.dto.CommentDTO;
import practice.board.vo.BoardVO;
import practice.board.vo.CommentVO;

public interface Mapper {
	
	public int login(@Param("id")String id, @Param("password")String password);

	public void boardRegister(BoardVO board);
	
	public BoardInfoDTO boardInfo(@Param("boardpid")int boardpid, @Param("personpid")int personpid);
	
	public void boardDelete(@Param("boardpid")int boardpid);
	
	public void commentRegister(CommentVO comment);
	
	public CommentDTO[] commentInfo(@Param("boardpid")int boardpid);
	
	public void commentDelete(@Param("commentpid")int commentpid);
	
	public void goodRegister(@Param("boardpid")int boardpid,@Param("personpid")int personpid);
	
	public void goodDelete(@Param("boardpid")int boardpid,@Param("personpid")int personpid);

}
