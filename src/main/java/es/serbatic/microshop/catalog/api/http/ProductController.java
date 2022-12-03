package es.serbatic.microshop.catalog.api.http;

import es.serbatic.microshop.catalog.api.http.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping
    public List<ProductDTO> findAll() {
        var product1 = new ProductDTO();
        product1.setId("T001-7891X");
        product1.setName("Product 1");
        product1.setPrice(1.2f);
        var product2 = new ProductDTO();
        product2.setId("T001-7870X");
        product2.setName("Product 2");
        product2.setPrice(1.50f);
        var product3 = new ProductDTO();
        product3.setId("T001-7875X");
        product3.setName("Product 3");
        product3.setPrice(5.99f);
        return List.of(product1, product2, product3);
    }
}
