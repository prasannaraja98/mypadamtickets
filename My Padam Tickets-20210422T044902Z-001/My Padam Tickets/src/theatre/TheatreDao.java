package theatre;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TheatreDao {
	public void insert_theatre_db(List<Theatre> theatres) {
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    
	    SessionFactory fact=cfg.buildSessionFactory();
	    
	    Session session=fact.openSession();
	    Transaction tx=session.beginTransaction();
	    for(Theatre theatre:theatres)
	    {
	    	session.save(theatre);	
	    }
	    System.out.println("data into theatre db successfully");
	    
	    tx.commit();
	    session.close();
	    fact.close();
		}
	
	public  List<Theatre> theatre_details_display() {
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    
	    SessionFactory fact=cfg.buildSessionFactory();
	    
	    Session session=fact.openSession();
	    Transaction tx=session.beginTransaction();        
       
      
            tx=session.beginTransaction();
            
            List<Theatre> theatres=session.createQuery("from Theatre").list();
           
            System.out.println("In theatre display method");
            return theatres;

	}
	public void update_theatre_seat_count(Theatre th,int seat)
	{
		Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    
	    SessionFactory fact=cfg.buildSessionFactory();
	    
	    Session session=fact.openSession();
	    Transaction tx=session.beginTransaction();        
       
      
         tx=session.beginTransaction();
		//employee.setSalary(salary);
        //session.update(employee);
         String updated_seat = String.valueOf(seat);
        // System.out.println("OLD SEAT:" +updated_seat);
         th.setSeats(updated_seat);
        // System.out.println("NEW SEAT:"+ th.getSeats());
         session.update(th);
         tx.commit();
         System.out.println("Updated Sucessfully");
	}
		
}
