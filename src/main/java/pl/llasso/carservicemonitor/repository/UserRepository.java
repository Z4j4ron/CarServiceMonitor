package pl.llasso.carservicemonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.llasso.carservicemonitor.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
