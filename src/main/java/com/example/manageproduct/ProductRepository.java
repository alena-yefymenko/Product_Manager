package com.example.manageproduct;

import org.springframework.data.jpa.repository.JpaRepository;

// Use for query's to db
// also can extend CrudRepository

public interface ProductRepository extends JpaRepository<Product,Long> {
}
