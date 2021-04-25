package com.bridgeit.springfrom;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass {
	final String key="a";

	@Autowired
	Dao daouser;
	
  @RequestMapping("/login")
	public String logIn(@ModelAttribute("user")User user,Model m) {
  List<User> list=daouser.getUsers();
	//System.out.println(list);
	//System.out.println(user.getEmail()+ " "+user.getPassword());
  
  /*if(list.size()==0) {
	  String msg="your are the first user plz first sign up ";
	  m.addAttribute("message", msg);
	  return "redirect:index.jsp";
  }
  */
  for(int i=0;i<list.size();i++) {
	//	System.out.println(list.get(i).getEmail()+" "+user.getEmail()+" "+list.get(i).getPassword()+" "+user.getPassword());

		String decryptPassword=ASEAlgorithm.decrypt(list.get(i).getPassword(), key);
		System.out.println(" asd"+decryptPassword);
	  if(list.get(i).getEmail().equals(user.getEmail())&&decryptPassword.equals(user.getPassword())&&list.get(i).getRole().equals("admin")) 
	  {
	  System.out.println("admin");
			String msg="hello admin"+list.get(i).getFirstName();
			  m.addAttribute("name", msg);

	 
	  return "home-page";
	  }
	  else if(list.get(i).getEmail().equals(user.getEmail())&&decryptPassword.equals(user.getPassword())&&list.get(i).getRole().equals("user")) 
{
		  System.out.println("user");
		  
	String msg="hello user"+list.get(i).getFirstName();
		  m.addAttribute("name", msg);
return "user-page";
	  }
  
  }
  System.out.println("nothing");
  return "error-page";
	}
  @RequestMapping("/signup")
  public String signUp() {
	  
	  
	  
	 return "sign-up";
 
  
  
  
  }
 @RequestMapping(value="/save",method=RequestMethod.POST)
 public String save(@ModelAttribute("user") User user,Model model) {
	 //System.out.println(user.getEmail());
	 
	 boolean check=emailValidate(user);
	 if(check)
	 {
		

		 
		 daouser.save(user);
	 
	 return "redirect:index.jsp";
	 }
	 else {
		 String msg="this email id already registered ";
		 model.addAttribute("message", msg);
		 return "sign-up";
	 }
 
 
 
 
 }
   
 boolean emailValidate(User user) {
	  List<User> list=daouser.getUsers();
	  for(int i=0;i<list.size();i++) {
		  if(user.getEmail().equals(list.get(i).getEmail())) {
			  return false;
		  }
	  }
return true;
	 
 }
 @RequestMapping("/logout")
 public String logOut() {
	 return "redirect:index.jsp";
 }
 
 


}
