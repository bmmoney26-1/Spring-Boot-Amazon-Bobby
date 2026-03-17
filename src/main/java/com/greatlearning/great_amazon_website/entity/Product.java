package com.greatlearning.great_amazon_website.entity;

import jakarta.persistence.*;

@Entity
// For overriding an object --> @Table(name = "Item")
public class Product {
   @Id
   @GeneratedValue
    private long id;
    //@Column(name = "title")
   private String name;
    private String price;

    public Product() {
    }

    public Product(long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
