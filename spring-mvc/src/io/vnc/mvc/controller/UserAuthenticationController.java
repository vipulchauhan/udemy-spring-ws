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
		userModel.addAttribute("newUser", new User());
		userModel.addAttribute("rolesOptions", userRoles);
		userModel.addAttribute("genders", genders);
		userModel.addAttribute("notificationPrefs", notificationPrefs);
		System.out.println("populating ref data");
		return "auth/register";
	}

	@RequestMapping("/profile")
	public String profile(Model userModel, @ModelAttribute("loggedUser") User loggedUser) {
		System.out.println("Fetching profile for user :---");
		System.out.println(loggedUser);
		userModel.addAttribute("loggedUser", loggedUser);
		return "auth/profile";
	}

	// redirection
	@RequestMapping("/login")
	public String login(Model userModel) {
		userModel.addAttribute("loggedUser", new User());
		return "auth/login";
	}

	// servlet
	@RequestMapping("/signup")
	public String signup(Model userModel, @Valid @ModelAttribute("newUser") User newUser, BindingResult bindingResult) {
		System.out.println("New User details :---");
		System.out.println(newUser);

		if (bindingResult.hasErrors()) {
			userModel.addAttribute("newUser", newUser);
			userModel.addAttribute("rolesOptions", userRoles);
			userModel.addAttribute("genders", genders);
			userModel.addAttribute("notificationPrefs", notificationPrefs);
			System.out.println("Validation Errors found:---");
			System.out.println(bindingResult);
			return "auth/register";
		} else {
			userModel.addAttribute("loggedUser", newUser);
			return "dashboard";
		}
	}

	// servlet
	@RequestMapping("/signin")
	public String signin(Model userModel, @ModelAttribute("loggedUser") User loggedUser) {

		userModel.addAttribute("loggedUser", loggedUser);

		return "dashboard";
	}
}
