package pl.llasso.carservicemonitor.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import pl.llasso.carservicemonitor.entities.User;

@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user){
        entityManager.persist(user);
    }

    public User findById(Long id){
        return entityManager.find(User.class, id);
    }
    public void update(User user){
        entityManager.merge(user);
    }
    public void deleteById(Long id){
        User user = findById(id);
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));

    }
}
