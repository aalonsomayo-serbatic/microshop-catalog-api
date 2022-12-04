package es.serbatic.microshop.catalog.core.services.impl;

import es.serbatic.microshop.catalog.core.model.Product;
import es.serbatic.microshop.catalog.core.services.ProductService;
import es.serbatic.microshop.catalog.repository.db.ProductRepository;
import es.serbatic.microshop.catalog.repository.db.ProductTypeRepository;
import es.serbatic.microshop.catalog.repository.http.WarehouseProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private WarehouseProductRepository warehouseProductRepository;

    public List<Product> findAll() {
        var warehouse = new HashMap<String, Integer>();
        for (var product: warehouseProductRepository.findAll()) {
            warehouse.put(product.getId(), product.getQuantity());
        }

        var discounts = new HashMap<String, Integer>();
        for (var discount: productTypeRepository.findAll()) {
            discounts.put(discount.getType(), discount.getDiscount());
        }

        var result = new ArrayList<Product>();
        for (var entity: productRepository.findAll()) {
            var product = new Product(entity.getType(), entity.getModel());
            product.setName(entity.getName());
            product.setPrice(entity.getPrice());
            product.setDiscount(discounts.getOrDefault(entity.getType(), 0));
            product.setQuantity(warehouse.getOrDefault(product.getId(), 0));
            result.add(product);
        }
        return result;
    }
}
