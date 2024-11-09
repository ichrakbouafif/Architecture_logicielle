package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domaine.Contract_Employee;
import domaine.Employee;
import domaine.Regular_Employee;

public class Store_Data {

	public static void main(String[] args) {
		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		Employee e1=new Employee();    
	        e1.setName("Yosr");    
	        
	        Regular_Employee e2=new Regular_Employee();    
	        e2.setName("Malek");    
	        e2.setSalary(32000);    
	        e2.setBonus(1);    
	        
	        Contract_Employee e3=new Contract_Employee();    
	        e3.setName("Mouhib");    
	        e3.setPay_per_hour(250);    
	        e3.setContract_duration("20 hours");    
	        
	        session.persist(e1);    
	        session.persist(e2);    
	        session.persist(e3);    
	    
	        t.commit();
		session.close();
		
		System.out.println("First employee Created Successfully" + e1.toString());
		System.out.println("Second employee Created Successfully" + e2.toString());
		System.out.println("Third employee Created Successfully" + e3.toString());  
	}
}
