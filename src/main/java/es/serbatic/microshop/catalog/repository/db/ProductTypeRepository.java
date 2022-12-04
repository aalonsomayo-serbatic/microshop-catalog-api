package es.serbatic.microshop.catalog.repository.db;

import es.serbatic.microshop.catalog.repository.db.entities.ProductId;
import es.serbatic.microshop.catalog.repository.db.entities.ProductTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductTypeRepository extends CrudRepository<ProductTypeEntity, ProductId> {
}
