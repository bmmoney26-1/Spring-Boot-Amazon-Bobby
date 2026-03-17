package com.greatlearning.great_amazon_website.repository;

import com.greatlearning.great_amazon_website.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
//Query Methods
Optional<Product> findByName(String name);
    @Query(value = "Select * from Product where name = ?1", nativeQuery = true)
    Product someCustomQuery(String name, String price);

    /*@Query( "Select p from Product p where p.name = :name")
Product someCustomQuery(@Param("name") String name, String price);*/


}
