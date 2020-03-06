package com.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.UserDAO;
import com.spring.domain.Account;
import com.spring.domain.User;

@Controller

//@RequestScope
public class UserController {
	private static final String Model = null;
	@InitBinder
	public void initBinder( WebDataBinder  dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor); // @ModelAttribute("user") User theUser
	}
//backing bean or object
	@RequestMapping("/")
	public String indexPage(Model model) {
		User user=new User();
		model.addAttribute(user);
		return "index";
		
	}
	
	
	
	
	
@RequestMapping("/processForm")
	public String setAuthentication(@Valid @ModelAttribute("user") User user,@RequestParam String Accountno,@RequestParam String userName,@RequestParam String Password,
			@RequestParam String Name, BindingResult result) {
//User user=new User();
Account acc=new Account();
		UserDAO dao = new UserDAO();
		Account account = dao.getAccountByAccountNumber(acc.getAccountNo());
		if (account != null) {
			account.getUser().setUserName(user.getUserName());
			account.getUser().setPassword(user.getPassword());
			dao.setUserNameAndPassword(account);
System.out.println("username and password already exist");
		} else {
System.out.println("username and password set sucessfully");
		}

		 if(result.hasErrors())  
	        {  
	            return "index";  
	        }  
	        else  
	        {  
	        return "withdraw";  
	        }  
		//return null;
	}
}
