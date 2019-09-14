package io.vnc.mvc.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	// redirection
	@RequestMapping("/register")
	public String register(Model userModel) {
		extracted(userModel, new User());
		System.out.println("populating ref data");
		return "auth/register";
	}

	private void extracted(Model userModel, User user) {
		userModel.addAttribute("newUser", user);
		userModel.addAttribute("rolesOptions", userRoles);
		userModel.addAttribute("genders", genders);
		userModel.addAttribute("notificationPrefs", notificationPrefs);
	}

	@RequestMapping("/profile")
	public String profile(Model userModel, @ModelAttribute("newUser") User newUser) {
		System.out.println("Fetching profile for user :---");
		System.out.println(newUser);
		extracted(userModel, newUser);
		return "auth/profile";
	}

	// redirection
	@RequestMapping("/login")
	public String login() {
		return "auth/login";
	}

	// servlet
	@RequestMapping("/signup")
	public String signup(Model userModel, @Valid @ModelAttribute("newUser") User newUser, BindingResult bindingResult) {
		System.out.println("New User details :---");
		System.out.println(newUser);
		extracted(userModel, newUser);
		if (bindingResult.hasErrors()) {
			System.out.println("Validation Errors found:---");
			System.out.println(bindingResult.getAllErrors());
			return "auth/register";
		} else
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
