package practice.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import practice.board.dto.Comment;
import practice.board.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	@Qualifier("CommentService")
	private CommentService service;
	
	@RequestMapping(value="/register",produces="application/json;charset=UTF-8",method=RequestMethod.POST)
	public void commentRegister(@RequestBody Comment comment) throws Exception{
		service.commentRegister(comment);
	}
	
}
