package es.serbatic.microshop.catalog.repository.http;

import es.serbatic.microshop.catalog.repository.http.entities.WarehouseProductEntity;

import java.util.List;

public interface WarehouseProductRepository {
    List<WarehouseProductEntity> findAll();
}
