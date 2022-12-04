package es.serbatic.microshop.catalog.api.http;

import es.serbatic.microshop.catalog.api.http.dto.ProductDTO;
import es.serbatic.microshop.catalog.core.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> findAll() {
        var response = new ArrayList<ProductDTO>();
        for (var product: productService.findAll()) {
            var productDTO = new ProductDTO();
            productDTO.setId(product.getId());
            productDTO.setName(product.getName());
            productDTO.setPrice(product.getPrice());
            productDTO.setDiscount(product.getDiscount());
            productDTO.setSalePrice(product.getSalePrice());
            productDTO.setQuantity(product.getQuantity());
            response.add(productDTO);
        }
        return response;
    }
}
