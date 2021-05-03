package seat;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import signup.SignUp;
import theatre.Theatre;

public class SeatDao {
public void seat_table(Seat seat) {
	Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    
    SessionFactory fact=cfg.buildSessionFactory();
    
    Session session=fact.openSession();
    Transaction tx=session.beginTransaction();
   
    session.save(seat);	
    System.out.println("data into seat db successfully");
    
    tx.commit();
    session.close();
    fact.close();
	
}
public boolean is_theatre_empty()
{
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory fact=cfg.buildSessionFactory();

Session session=fact.openSession();
Transaction tx=session.beginTransaction();
	 if(session.createQuery("from Theatre").list().size() == 0)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }

}
	
}


