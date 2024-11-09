package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class UserControllerImplAnno {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("dao", "service");
		UserService service = (UserService) context.getBean("service");
		System.out.println(service.calcul());
	}
}
