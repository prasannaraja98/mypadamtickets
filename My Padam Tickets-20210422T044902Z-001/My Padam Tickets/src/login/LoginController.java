package login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import signup.*;

@Controller
public class LoginController {
	@RequestMapping("/loginpage")
	
	public ModelAndView login() {
		
		return new ModelAndView("login");
	}
	@RequestMapping("/login")
	public ModelAndView  insert_login_db(@RequestParam("username")String username, @RequestParam("password")String password) {
		Login login=new Login();
		
		ModelAndView model = new ModelAndView();
		
		
		login.setUsername(username);
		login.setPassword(password);
		
		LoginDao dao=new LoginDao();
		
		List<SignUp> users=dao.signup_details();
		
		boolean flag=false;
		
		for(SignUp user: users )
		{
			
			if(user.getUsername().equals(username)&& user.getPassword().equals(password))
			{
				flag=true;
				//System.out.println("login Success");
				break;
			}
			
		}
		if(flag) {
			
			 model=new ModelAndView("movies","username",username);
		}
		else
		{
			 model=new ModelAndView("login");
		}
		
		return model;
	}
}
