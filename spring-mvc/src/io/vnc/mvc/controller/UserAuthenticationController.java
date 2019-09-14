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

	private HashMap<String, String> genders = new LinkedHashMap<>();

	private HashMap<String, String> notificationPrefs = new LinkedHashMap<>();

	public UserAuthenticationController() {
		genders.put("male", "Male");
		genders.put("female", "Female");
		genders.put("other", "Other");

		notificationPrefs.put("email", "email");
		notificationPrefs.put("sms", "sms");
		notificationPrefs.put("whatsapp", "whatsapp");
	}

	// redirection
	@RequestMapping("/register")
	public String register(Model userModel) {
		userModel.addAttribute("newUser", new User());
		userModel.addAttribute("rolesOptions", userRoles);
		userModel.addAttribute("genders", genders);
		userModel.addAttribute("notificationPrefs", notificationPrefs);
		return "auth/register";
	}

	@RequestMapping("/profile")
	public String profile(@ModelAttribute("newUser") User newUser) {
		System.out.println("Fetching profile for user :---");
		System.out.println(newUser);
		return "auth/profile";
	}

	// redirection
	@RequestMapping("/login")
	public String login() {
		return "auth/login";
	}

	// servlet
	@RequestMapping("/signup")
	public String signup(@ModelAttribute("newUser") User newUser) {
		System.out.println("New User details :---");
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
