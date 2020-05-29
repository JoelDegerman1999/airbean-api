package se.air.airbean.airbean.repositories;

import org.springframework.data.repository.CrudRepository;
import se.air.airbean.airbean.entites.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
