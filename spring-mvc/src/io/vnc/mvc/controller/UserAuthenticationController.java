package io.vnc.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAuthenticationController {

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("/signup")
	public String signup() {

		return "dashboard";

	}

	@RequestMapping("/signin")
	public String signin() {

		return "dashboard";

	}
}
