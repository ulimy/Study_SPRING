package practice.board.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import practice.board.service.CommentService;
import practice.board.vo.CommentVO;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	@Qualifier("CommentService")
	private CommentService service;
	
//	¥Ò±€ µÓ∑œ
	@RequestMapping(value="/register",produces="application/json;charset=UTF-8",method=RequestMethod.POST)
	public void commentRegister(@RequestBody CommentVO comment) throws Exception{
		service.commentRegister(comment);
	}

//	¥Ò±€ ªË¡¶
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public void commentDelete(@RequestBody JSONObject obj) throws Exception{
		int commentpid = (Integer)obj.get("commentpid");
		service.commentDelete(commentpid);
		return;
	}
	
}
