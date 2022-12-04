package es.serbatic.microshop.catalog.repository.http.impl;

import es.serbatic.microshop.catalog.repository.http.WarehouseProductRepository;
import es.serbatic.microshop.catalog.repository.http.entities.WarehouseProductEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class WarehouseProductRepositoryImpl implements WarehouseProductRepository {

    public List<WarehouseProductEntity> findAll() {
        var restTemplate = new RestTemplate();
        return Arrays.stream(Objects.requireNonNull(restTemplate.getForObject("http://localhost:8082/product", WarehouseProductEntity[].class)))
                .collect(Collectors.toList());
    }
}
