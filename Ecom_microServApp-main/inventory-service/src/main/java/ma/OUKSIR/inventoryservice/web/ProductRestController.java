package ma.houmam.inventoryservice.web;

import ma.houmam.inventoryservice.repositories.ProductRepository;
import ma.houmam.inventoryservice.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductRepository productRepository;
    public ProductRestController(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    public List<Product> productList(){

        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product productList(@PathVariable String id){

        return productRepository.findById(id).get();
    }
}
