package com.bridgeit.model;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Demo {
 
	@RequestMapping("/demo")
	public String display(HttpServletRequest request,Model model) {
		System.out.println("hello");
		String name=request.getParameter("name");
		System.out.println(request.getParameter("password")+"hello");
		
		String password=request.getParameter("password");
		//System.out.println(password);
		
		if(password.equals("admin")) {
			String text="welcome"+name;
			model.addAttribute("message", text);
			return "viewpage";
		}else  {
		
			String text="sorry"+name+"your not password is in correct";
			model.addAttribute("message", text);
			
			
			
			return "errorpage";
	}
		}

	/*@RequestMapping("/demo")
	public String display(@RequestParam("name") String name,@RequestParam("password") String password,Model model) {
		System.out.println("hello");
		
		
		if(password.equals("admin")) {
			String text="welcome"+name;
			model.addAttribute("message", text);
			return "viewpage";
		}else  {
		
			String text="sorry"+name+"your not password is in correct";
			model.addAttribute("message", text);
			
			
			
			return "errorpage";
	}
		}*/
}
