package com.backend.Catalog.repositories;

import com.backend.Catalog.entities.Category;
import com.backend.Catalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
