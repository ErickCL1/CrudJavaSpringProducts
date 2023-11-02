package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name="product")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;

    private Integer quantity;


    //IMPLEMENTAÇÃO DO DTO
    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price = requestProduct.price();
        this.quantity = requestProduct.quantity();

    }

    public void setName(String name) {
    }

    public void setPrice(Integer integer) {
    }
    public void setQuantity(Integer integer) {
    }
}
