package ulim.practice.board.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ulim.practice.board.profile.Profile;

@Controller
public class ProfileController {

	@RequestMapping("/login")
	public @ResponseBody Profile login(@RequestBody Profile p) {

		return p;
	}
}
