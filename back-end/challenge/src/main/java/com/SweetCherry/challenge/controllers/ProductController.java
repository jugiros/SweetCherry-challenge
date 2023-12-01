package com.SweetCherry.challenge.controllers;
import com.SweetCherry.challenge.models.Product;
import com.SweetCherry.challenge.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Page<Product> findProductsByPrecioAndTitulo(
            Product product,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return productService.findByPrecioAndTitulo(product, pageRequest);
    }
}
