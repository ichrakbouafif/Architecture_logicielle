package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domaine.EmailNotification;
import domaine.SmsNotification;
import domaine.Notification;

public class StoreData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Notification n1=new Notification();    
	        n1.setFirstname("Ahmed"); 
	        n1.setLastname("ben Ali");
	        n1.setCreatedOn(null);
	        
	        SmsNotification n2=new SmsNotification();    
	        n2.setFirstname("Emna");
	        n2.setLastname("Amouna");
	        n2.setPhoneNumber("123123123");
	        
	       
	        EmailNotification n3=new EmailNotification();    
	        n3.setFirstname("Sara");   
	        n3.setLastname("Salah");
	        n3.setEmailAdress("sara@gmail.com");
	        
	        session.persist(n1);    
	        session.persist(n2);    
	        session.persist(n3);    
	    
	        t.commit();
		session.close();
		
		System.out.println("First notification Created Successfully" + n1.toString());
		System.out.println("Second notification Created Successfully" + n2.toString());
		System.out.println("Third notification Created Successfully" + n3.toString());  
	}
}
