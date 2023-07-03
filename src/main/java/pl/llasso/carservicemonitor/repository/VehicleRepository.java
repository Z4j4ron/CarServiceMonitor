package pl.llasso.carservicemonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.llasso.carservicemonitor.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
