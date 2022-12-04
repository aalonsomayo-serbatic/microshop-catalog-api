package es.serbatic.microshop.catalog.core.services.impl;

import es.serbatic.microshop.catalog.core.model.Product;
import es.serbatic.microshop.catalog.core.services.ProductService;
import es.serbatic.microshop.catalog.repository.db.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        var result = new ArrayList<Product>();
        for (var entity: productRepository.findAll()) {
            var product = new Product(entity.getType(), entity.getModel());
            product.setName(entity.getName());
            product.setPrice(entity.getPrice());
            result.add(product);
        }
        return result;
    }
}
