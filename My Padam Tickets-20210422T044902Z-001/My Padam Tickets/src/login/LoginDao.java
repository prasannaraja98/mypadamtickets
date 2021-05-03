package login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import signup.SignUp;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class LoginDao {
	public void insert_login_db(Login login) {
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    
	    SessionFactory fact=cfg.buildSessionFactory();
	    
	    Session session=fact.openSession();
	    Transaction tx=session.beginTransaction();
	    session.save(login);
	    System.out.println("Done Successfully");
	    
	    tx.commit();
	    session.close();
	    fact.close();
		}
	
	public  List<SignUp> signup_details() {
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    
	    SessionFactory fact=cfg.buildSessionFactory();
	    
	    Session session=fact.openSession();
	    Transaction tx=session.beginTransaction();        
        int num;
      
            tx=session.beginTransaction();
            
            List<SignUp> users=session.createQuery("from SignUp").list();
            
            return users;

	}
       
}
