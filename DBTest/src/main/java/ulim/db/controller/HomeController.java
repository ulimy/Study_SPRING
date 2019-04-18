package ulim.db.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ulim.db.dao.Mapper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private Mapper mapper;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/list")
	public String list(HttpServletRequest request,Model model){
		String memberId = request.getParameter("memberId");
		String rs = mapper.memberId(memberId);
		model.addAttribute("memberId",rs);

		return "list";
	}
	
}
