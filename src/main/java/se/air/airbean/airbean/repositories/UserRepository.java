package se.air.airbean.airbean.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import se.air.airbean.airbean.entites.User;
import se.air.airbean.airbean.projections.CustomUser;

@RepositoryRestResource(excerptProjection = CustomUser.class)
public interface UserRepository extends CrudRepository<User, Long> {
}
