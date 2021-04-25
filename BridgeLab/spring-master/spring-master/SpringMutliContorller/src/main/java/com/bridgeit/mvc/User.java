package com.bridgeit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {
@RequestMapping("/user")
public String userContorller() {
	return "user";
}
}
