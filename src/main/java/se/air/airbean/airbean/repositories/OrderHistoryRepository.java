package se.air.airbean.airbean.repositories;

import org.springframework.data.repository.CrudRepository;
import se.air.airbean.airbean.entites.OrderHistory;

public interface OrderHistoryRepository extends CrudRepository<OrderHistory, Long> {
}
