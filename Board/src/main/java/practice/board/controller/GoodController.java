package practice.board.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import practice.board.service.GoodService;

@Controller
@RequestMapping("/good")
public class GoodController {

	@Autowired
	@Qualifier("GoodService")
	GoodService service;
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public void GoodRegister(@RequestBody JSONObject obj){
		int boardpid = (Integer)obj.get("boardpid");
		int personpid = (Integer)obj.get("personpid");
		service.goodRegister(boardpid, personpid);
		return;
	}
	
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public void GoodDelete(@RequestBody JSONObject obj){
		int boardpid = (Integer)obj.get("boardpid");
		int personpid = (Integer)obj.get("personpid");
		service.goodDelete(boardpid, personpid);
		return;
	}
	
}
