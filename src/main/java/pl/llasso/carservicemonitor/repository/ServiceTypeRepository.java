package pl.llasso.carservicemonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.llasso.carservicemonitor.entities.ServiceType;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Long> {
}
