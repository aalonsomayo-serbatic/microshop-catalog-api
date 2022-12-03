package es.serbatic.microshop.catalog.repository.db;

import es.serbatic.microshop.catalog.repository.db.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, String> {
}
