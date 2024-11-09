package controller;

import dao.UserDaoImpl;
import service.UserServiceImpl;

public class UserControllerImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDaoImpl dao = new UserDaoImpl();
		UserServiceImpl service = new UserServiceImpl();
		service.setDao(dao);
		System.out.println(service.calcul());
	}

}
