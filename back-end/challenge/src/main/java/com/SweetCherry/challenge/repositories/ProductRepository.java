package com.SweetCherry.challenge.repositories;
import com.SweetCherry.challenge.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM products p WHERE p.precio = :parametro OR p.titulo LIKE %:parametro%", nativeQuery = true)
    Page<Product> findByPrecioOrTitulo(String parametro, Pageable pageable);
}