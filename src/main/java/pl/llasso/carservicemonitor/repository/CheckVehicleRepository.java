package pl.llasso.carservicemonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.llasso.carservicemonitor.entities.CheckVehicle;

import java.util.List;

public interface CheckVehicleRepository extends JpaRepository<CheckVehicle, Long> {

    List<CheckVehicle> findCheckVehicleByVehicleId(Long id);
}
