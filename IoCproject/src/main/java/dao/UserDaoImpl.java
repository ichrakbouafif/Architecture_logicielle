package dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public double getValue() {
        // Return some data, for example
        return 42.0; // Example value
    }
}
