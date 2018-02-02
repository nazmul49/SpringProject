package com.bjit.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bjit.training.model.Student;
import com.bjit.training.model.User;
import com.bjit.training.services.UserService;

@Controller
@SessionAttributes("user")
public class LoginController {
	/*
	 * Add student in model attribute
	 */

	public static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");


	@ModelAttribute("user")
	public User setUpUserForm1() {
		return new User();
	}

	@GetMapping("/")
	public String index() {
		return "login2";
	}

	@PostMapping("/dologin2")
	public String doLogin2(@ModelAttribute("user") User user, Model model) {

		UserService adminUser = (UserService) ctx.getBean("adminUser");

		User user2 = new User();
		user2 = adminUser.getUser(user.getEmail(), user.getPassword());

		if (user2 == null) {
			System.out.println("got you 2!");
			model.addAttribute("message", "Login failed. Try again.");
			return "login2";
		}
		
		
		// adding user information to session variable
		user.setName(user2.getName());
		user.setAddress(user2.getAddress());
		user.setAge(user2.getAge());
		user.setGender(user2.getGender());
		user.setEmail(user2.getEmail());
		user.setType(user2.getType());

		if (user2.getType().equals("admin")) {
			return "success";
		} else {
			return "info";
		}

	}


	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String studentInfo(@SessionAttribute("user") User user) {
		System.out.println("Email: " + user.getEmail());
		System.out.println("Name: " + user.getName());
		return "info";
	}
}