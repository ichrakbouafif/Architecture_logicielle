package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domaine.Contract_Employee;
import domaine.Employee;
import domaine.Regular_Employee;

public class StoreData {

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
	        e1.setName("Gaurav Chawla");    
	        
	        Regular_Employee e2=new Regular_Employee();    
	        e2.setName("Vivek Kumar");    
	        e2.setSalary(50000);    
	        e2.setBonus(5);    
	        
	        Contract_Employee e3=new Contract_Employee();    
	        e3.setName("Arjun Kumar");    
	        e3.setPay_per_hour(1000);    
	        e3.setContract_duration("15 hours");    
	        
	        session.persist(e1);    
	        session.persist(e2);    
	        session.persist(e3);    
	    
	        t.commit();//transaction is commited
		session.close();
		
		System.out.println("First employee Created Successfully" + e1.toString());
		System.out.println("Second employee Created Successfully" + e2.toString());
		System.out.println("Third employee Created Successfully" + e3.toString());  
	}
}
