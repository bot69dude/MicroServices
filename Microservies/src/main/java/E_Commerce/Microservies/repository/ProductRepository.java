package E_Commerce.Microservies.repository;

import E_Commerce.Microservies.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}