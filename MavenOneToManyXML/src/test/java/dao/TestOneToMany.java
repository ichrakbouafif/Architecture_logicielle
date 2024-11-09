package dao;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import domaine.Account;
import domaine.Employee;


public class TestOneToMany {
	
     public static void main(String[] args) {
		
		//creating configuration object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating session factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		//creating transaction object
		Transaction t=session.beginTransaction();			
	
		//Bidirectionnel
		Employee employee = new Employee();
		employee.setEmail("demo-user-first@mail.com");
		employee.setFirst_name("demo-one"); 
		employee.setLast_name("user-one");		
		
		Account a1 = new Account();
		a1.setAcc_number("Account detail 1");		
		Account a2 = new Account();
		a2.setAcc_number("Account detail 2");
		
		Set<Account> accountList = new HashSet<Account>(); 
		accountList.add(a1);
		accountList.add(a2); 
		 
		employee.setAccounts(accountList);
		
		session.save(employee);
		session.save(a1);
		session.save(a2);
		
		t.commit();//transaction is commited
		session.close();
		
		System.out.println("Employee Created Successfully" + employee.toString());	
	}
}
