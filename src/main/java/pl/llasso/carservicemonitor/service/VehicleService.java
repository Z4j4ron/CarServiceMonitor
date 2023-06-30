package pl.llasso.carservicemonitor.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.llasso.carservicemonitor.dao.VehicleDao;
import pl.llasso.carservicemonitor.entities.User;
import pl.llasso.carservicemonitor.entities.Vehicle;

import java.util.List;

@Service
@Transactional
public class VehicleService {
    private final VehicleDao vehicleDao;

    public VehicleService(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    public void save(Vehicle vehicle){
        vehicleDao.save(vehicle);
    }
    public Vehicle findById(Long id){
        return vehicleDao.findById(id);
    }
    public List<Vehicle> findAll(){
        return vehicleDao.findALl();
    }
    public void update(Vehicle vehicle){
        vehicleDao.update(vehicle);
    }
    public void deleteById(Long id){
        vehicleDao.deleteById(id);
    }

}
