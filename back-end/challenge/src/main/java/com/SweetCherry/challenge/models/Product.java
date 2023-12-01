package com.SweetCherry.challenge.models;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "sku")
    private String sku;

    @Column(name = "cantidad")
    private Integer cantidad;
}