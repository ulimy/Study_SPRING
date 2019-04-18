package ulim.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	@RequestMapping(value="/")
	public void main(){
		
	}
	
	@RequestMapping(value="/info",method=RequestMethod.POST)
	public void boardInfo(){
		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void boardRegister(){
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void boardDelete(){
		
	}
	
	
	
}
