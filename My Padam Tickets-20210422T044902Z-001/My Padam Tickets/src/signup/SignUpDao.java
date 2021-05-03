package signup;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class SignUpDao {
	public void insert_signup_db(SignUp signup) {
	Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    
    SessionFactory fact=cfg.buildSessionFactory();
    
    Session session=fact.openSession();
    Transaction tx=session.beginTransaction();
    session.save(signup);
    System.out.println("Inserted into DB  Successfully");
    
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
        
      
    tx=session.beginTransaction();
            
    List<SignUp> users=session.createQuery("from SignUp").list();
            
    return users;

	}
}
