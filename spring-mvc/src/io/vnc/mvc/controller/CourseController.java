package io.vnc.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.vnc.mvc.dto.Course;

@Controller
@RequestMapping("/course")
public class CourseController {

	@RequestMapping("/add")
	public String addCourse(Model userModel, @Valid @ModelAttribute("course") Course course,
			BindingResult bindingResult) {
		System.out.println("New Course details :---");
		System.out.println(course);

		if (bindingResult.hasErrors()) {
			userModel.addAttribute("course", course);
			System.out.println("Validation Errors found:---");
			System.out.println(bindingResult);
			return "dashboard";
		} else {
			userModel.addAttribute("course", new Course());
			return "dashboard";
		}
	}
}
