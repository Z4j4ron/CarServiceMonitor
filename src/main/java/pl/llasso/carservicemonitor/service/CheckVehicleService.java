package pl.llasso.carservicemonitor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.llasso.carservicemonitor.entities.CheckVehicle;
import pl.llasso.carservicemonitor.entities.Vehicle;
import pl.llasso.carservicemonitor.repository.CheckVehicleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckVehicleService {
    private final CheckVehicleRepository checkVehicleRepository;

    public void save(CheckVehicle checkVehicle){
        checkVehicleRepository.save(checkVehicle);
    }

    public List<CheckVehicle> findAll(){
        return checkVehicleRepository.findAll();
    }

    public void update(CheckVehicle checkVehicle){
        checkVehicleRepository.save(checkVehicle);
    }

    public void deleteById(Long id){
        checkVehicleRepository.deleteById(id);
    }

    public List<CheckVehicle> findCheckVehicleByVehicleId(Long id){
        return checkVehicleRepository.findCheckVehicleByVehicleId(id);
    }
}
