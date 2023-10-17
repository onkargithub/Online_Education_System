package com.shiraleOnkar.project.session.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shiraleOnkar.project.session.Model.Contact;
import com.shiraleOnkar.project.session.Model.Login;

@Controller
public class loginController {
	
	@Autowired
	SessionFactory sf;
	
	@RequestMapping("/") // localhost:8080
	public String loginn() {
		return "login";
		
	}
	
	@RequestMapping("/login")
	public String logind(Login login, Model model) {
		Session s= sf.openSession();
		Login dblogin=s.get(Login.class, login.getPassword());
		
		String msg = null;
		String page = "login";
		if (dblogin != null) {
			if (login.getUsername().equals(dblogin.getUsername())) {
				page= "home";
			} else {
				msg= "Invalid Username";

			}
			
		} else {
			msg= "Invalid Password";

		} 
		model.addAttribute("msg",msg);
		return page;
	}
	
	
	@RequestMapping("/logpage") // localhost:8080
	public String log() {
		return "login";
		
	}

	
	
	@RequestMapping("createaccountpage")
	public String createaccountpage() {
		return "createaccount";
		
	}
	
	
	@RequestMapping("/createaccount")
	public String createaccountpageDB(Login login) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(login);
		t.commit();
		return "login";
		
	}

	
	
	@RequestMapping("homepage")
	public String homepage() {
		return "home";
		
	}
	
	@RequestMapping("aboutpage")
	public String aboutpage() {
		return "about";
		
	}
	
	@RequestMapping("coursepage")
	public String coursepage() {
		return "course";
		
	}	
	
	@RequestMapping("contactpage")
	public String contactPage() {
		return "contact";
		
	}	
	
	@RequestMapping("/contact")
	public String createaccountpageDB(Contact contact) {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(contact);
		t.commit();
		return "contact";
		
	}
	

}