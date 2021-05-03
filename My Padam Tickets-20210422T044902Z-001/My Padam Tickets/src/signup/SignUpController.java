package signup;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SignUpController {
	@RequestMapping("/signuppage")
	
	public ModelAndView signup() {
			
		return new ModelAndView("signup");
		}
	@RequestMapping("/signup")
	public ModelAndView insert_signup_db(@RequestParam("name")String name, @RequestParam("phoneno")String phoneno, @RequestParam("email")String email, @RequestParam("username")String username, @RequestParam("password1")String password1, @RequestParam("password2")String password2) {
		
		ModelAndView model = new ModelAndView();
		
		SignUp signup=new SignUp();
		signup.setName(name);
		signup.setPhoneno(phoneno);
		signup.setEmail(email);
		signup.setUsername(username);
		signup.setPassword(password1);
		
		SignUpDao signupdao = new SignUpDao();
		//signup_details contains all the user details who have registered
		List<SignUp> signup_details = signupdao.signup_details();
		
		boolean flag =false;
		
		//loop to check if the username already exists
		for(SignUp signup1: signup_details)
		{
			if(signup1.getUsername().equals(username))
			{
				flag = true;
				break;
			}
		}
		
		//if the username already exists return the signup page
		if(flag)
		{
			 model=new ModelAndView("signup");
		}
		
		//if username is not duplicate redirect to login page
		else {
			signupdao.insert_signup_db(signup);
			model=new ModelAndView("login");
		}
		return model;
		}
}
