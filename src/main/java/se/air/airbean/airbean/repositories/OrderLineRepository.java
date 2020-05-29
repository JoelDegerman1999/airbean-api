package se.air.airbean.airbean.repositories;

import org.springframework.data.repository.CrudRepository;
import se.air.airbean.airbean.entites.OrderLine;

public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {
}
