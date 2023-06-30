package pl.llasso.carservicemonitor.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import pl.llasso.carservicemonitor.entities.Vehicle;

import java.util.List;

@Repository
public class VehicleDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Vehicle vehicle){
        entityManager.persist(vehicle);
    }
    public Vehicle findById(Long id){
        return entityManager.find(Vehicle.class, id);
    }
    public List<Vehicle> findALl(){
        return entityManager.createQuery("select v from Vehicle v")
                .getResultList();
    }
    public void update(Vehicle vehicle){
        entityManager.merge(vehicle);
    }
    public void deleteById(Long id){
        Vehicle vehicle = findById(id);
        entityManager.remove(entityManager.contains(vehicle) ? vehicle : entityManager.merge(vehicle));
    }
}
