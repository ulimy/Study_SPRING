package practice.board.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import practice.board.dto.Board;
import practice.board.service.BoardService;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	@Qualifier("BoardService")
	private BoardService service;
	
//  力前 炼雀
	@RequestMapping(value="/info",produces="application/json;charset=UTF-8",method=RequestMethod.POST)
	public @ResponseBody JSONArray boardInfo(@RequestBody JSONObject obj) throws Exception{
		
		int boardpid = (Integer)obj.get("boardpid");
		return service.boardInfo(boardpid);
		
	}
	
//	力前 殿废
	@RequestMapping(value="/register",produces="application/json;charset=UTF-8",method=RequestMethod.POST)
	public void boadRegister(@RequestBody Board board) throws Exception{
		
		service.boardRegiser(board);
		return;
	
	}
	
//	力前 昏力
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public void boardDelete(@RequestBody JSONObject obj) throws Exception{
		
		int boardpid = (Integer)obj.get("boardpid");
		service.boardDelete(boardpid);
		return;
	}
	
}
