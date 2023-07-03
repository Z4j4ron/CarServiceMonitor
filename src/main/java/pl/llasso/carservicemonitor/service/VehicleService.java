package pl.llasso.carservicemonitor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.llasso.carservicemonitor.entities.Vehicle;
import pl.llasso.carservicemonitor.repository.VehicleRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;


    public void save(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }
    public Vehicle findById(Long id){
        return vehicleRepository.findById(id).get();
    }
    public List<Vehicle> findAll(){
        return vehicleRepository.findAll();
    }
    public void update(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }
    public void deleteById(Long id){
        vehicleRepository.deleteById(id);
    }

}
