package com.SweetCherry.challenge.services;
import com.SweetCherry.challenge.models.Product;
import com.SweetCherry.challenge.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> findByPrecioAndTitulo(Product product, Pageable pageable) {
        return productRepository.findByPrecioAndTitulo(product, pageable);
    }
}
