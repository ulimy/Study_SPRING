package practice.board.controller;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import practice.board.service.BoardService;
import practice.board.vo.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	@Qualifier("BoardService")
	private BoardService service;
	
	
//  ��ǰ ��ȸ
	@RequestMapping(value="/info",produces="application/json;charset=UTF-8",method=RequestMethod.POST)
	public @ResponseBody JSONArray boardInfo(@RequestBody JSONObject obj,HttpSession session) throws Exception{
		int boardpid = (Integer)obj.get("boardpid");
		return service.boardInfo(boardpid,1);
	}
	
//	��ǰ ���
	@RequestMapping(value="/register",produces="application/json;charset=UTF-8",method=RequestMethod.POST)
	public void boadRegister(@RequestBody BoardVO board,HttpSession session) throws Exception{	
		board.setPersonpid((Integer)session.getAttribute("personpid"));
		service.boardRegiser(board);
		return;
	}
	
//	��ǰ ����
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public void boardDelete(@RequestBody JSONObject obj) throws Exception{
		int boardpid = (Integer)obj.get("boardpid");
		service.boardDelete(boardpid);
		return;
	}
	
}
