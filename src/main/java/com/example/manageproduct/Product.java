package com.example.manageproduct;

import jakarta.persistence.*;
import lombok.Data;// Using for less code, generate getters, setters, toString etc


@Data // annotation for using Lombok
@Entity
/*@Table(name = "products")*/
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    private Long id;
    private String name;
    private int quantity;
    private double price;
    private String description;
    private boolean available;

}


    /*Build a spring boot + html css web app with following functionality
        creating products (name, quantity, price, description, UUID, isAvailable)
        updating products
        viewing product list
        viewing single product
        deleting product
        Make the page look nice enough with css
        Save all data to ArrayList  */