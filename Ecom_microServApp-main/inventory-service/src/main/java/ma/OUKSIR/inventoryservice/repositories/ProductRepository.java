package ma.houmam.inventoryservice.repositories;

import ma.houmam.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
