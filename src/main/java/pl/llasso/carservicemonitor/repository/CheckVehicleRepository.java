package pl.llasso.carservicemonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.llasso.carservicemonitor.entities.CheckVehicle;

public interface CheckVehicleRepository extends JpaRepository<CheckVehicle, Long> {
}
