package ulim.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/comment")
public class CommentController {

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void commentRegister(){
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void commentDelete(){
		
	}
	
}
