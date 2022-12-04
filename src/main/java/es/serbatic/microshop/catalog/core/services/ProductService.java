package es.serbatic.microshop.catalog.core.services;

import es.serbatic.microshop.catalog.core.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
