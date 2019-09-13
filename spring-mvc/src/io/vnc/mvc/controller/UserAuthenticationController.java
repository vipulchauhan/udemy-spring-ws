package io.vnc.mvc.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.vnc.mvc.dto.User;

@Controller
@RequestMapping("/auth")
public class UserAuthenticationController {
	@Value("#{rolesOptions}")
	private HashMap<String, String> userRoles = new LinkedHashMap<>();

	// redirection
	@RequestMapping("/register")
	public String register(Model userModel) {
		userModel.addAttribute("newUser", new User());
		userModel.addAttribute("rolesOptions", userRoles);
		return "auth/register";
	}

	// redirection
	@RequestMapping("/login")
	public String login() {
		return "auth/login";
	}

	// servlet
	@RequestMapping("/signup")
	public String signup(@ModelAttribute("newUser") User newUser) {
		System.out.println("New Student details :---");
		System.out.println(newUser);
		return "dashboard";
	}

	// servlet
	@RequestMapping("/signin")
	public String signin(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {

		User user = new User();
		model.addAttribute("userDetail", user);

		return "dashboard";
	}
}
