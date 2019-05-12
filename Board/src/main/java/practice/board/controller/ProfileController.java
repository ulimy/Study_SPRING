package practice.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import practice.board.service.ProfileService;
import practice.board.vo.ProfileVO;


@Controller
public class ProfileController {
	
	@Autowired
	@Qualifier("ProfileService")
	ProfileService service;


	@RequestMapping(value="/login",method=RequestMethod.POST)
	public void login(@RequestBody ProfileVO profile,HttpSession session){
		int personpid = service.login(profile);
		session.setAttribute("personpid",personpid);
		return;
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	public void logout(HttpSession session){
		session.invalidate();
		return;
	}
	
	
}
