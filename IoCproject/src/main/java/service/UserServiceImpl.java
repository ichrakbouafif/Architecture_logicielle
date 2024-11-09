package service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;

@Service("service")
public class UserServiceImpl implements UserService {	
	private UserDao dao;
	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double data = dao.getValue();
		return data * 2;
	}	
	@Autowired
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}
