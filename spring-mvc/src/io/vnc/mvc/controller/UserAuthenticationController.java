package io.vnc.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.vnc.mvc.dto.User;

@Controller
public class UserAuthenticationController {

	// redirection
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	// redirection
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	// servlet
	@RequestMapping("/signup")
	public String signup(HttpServletRequest request, Model model) {

		User user = new User();
		user.setFullname(request.getParameter("fullname"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		model.addAttribute("userDetail", user);
		
		return "dashboard";
	}

	// servlet
	@RequestMapping("/signin")
	public String signin() {
		return "dashboard";
	}
}
