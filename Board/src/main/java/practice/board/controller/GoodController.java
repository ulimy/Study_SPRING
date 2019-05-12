package practice.board.controller;

import javax.servlet.http.HttpSession;

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
	public void GoodRegister(@RequestBody JSONObject obj,HttpSession session){
		int boardpid = (Integer)obj.get("boardpid");
		service.goodRegister(boardpid, (Integer)session.getAttribute("personpid"));
		return;
	}
	
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public void GoodDelete(@RequestBody JSONObject obj,HttpSession session){
		int boardpid = (Integer)obj.get("boardpid");
		service.goodDelete(boardpid, (Integer)session.getAttribute("personpid"));
		return;
	}
	
}
