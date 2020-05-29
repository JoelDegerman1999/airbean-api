package se.air.airbean.airbean.repositories;

import org.springframework.data.repository.CrudRepository;
import se.air.airbean.airbean.entites.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
