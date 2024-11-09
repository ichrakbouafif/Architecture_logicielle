package service;

import dao.UserDao;

public class UserServiceImpl implements UserService {

	private UserDao dao;
	@Override
	public double calcul() {
		
		double data = dao.getValue();
		return data * 2;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}
