package com.bridgeit.formtag;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogIn {
@RequestMapping("/check")
public String check(HttpServletRequest request,Model model   )
{
//	System.out.println("hello");
	String name=request.getParameter("name");
//	System.out.println(request.getParameter("password")+"hello");
	
	String password=request.getParameter("password");
	//System.out.println(password);
	
	if(password.equals("admin")) {
		String text="welcome"+name;
		model.addAttribute("message", text);
		return "reg-page";
	}else  {
	
		String text="sorry"+name+"your not password is in correct";
		model.addAttribute("message", text);
		
		
		
		return "errorpage";
} 	
}
}
