package pl.llasso.carservicemonitor.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.llasso.carservicemonitor.dao.UserDao;
import pl.llasso.carservicemonitor.entities.User;

@Service
@Transactional
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user){
        userDao.save(user);
    }
    public User findById(Long id){
        return userDao.findById(id);
    }
    public void update(User user){
        userDao.update(user);
    }
    public void deleteById(Long id){
        userDao.deleteById(id);
    }
}
