package com.example.manageproduct;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
/*@Table(name = "products")*/
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String name;
    private int quantity;
    private double price;
    private String description;
    private boolean available;

}


    
