package com.SweetCherry.challenge.controllers;
import com.SweetCherry.challenge.models.Product;
import com.SweetCherry.challenge.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public Page<Product> findProductsByPrecioAndTitulo(
            @RequestParam(required = false) String parametro,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return productService.findByPrecioAndTitulo(parametro, pageRequest);
    }

    @GetMapping("/products")
    public ResponseEntity<Page<Product>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Product> productsPage = productService.getAllProducts(page, size);
        return new ResponseEntity<>(productsPage, HttpStatus.OK);
    }
}
