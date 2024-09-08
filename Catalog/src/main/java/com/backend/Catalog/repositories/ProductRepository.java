package com.backend.Catalog.repositories;

import com.backend.Catalog.entities.Category;
import com.backend.Catalog.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT DISTINCT prod FROM Product prod INNER JOIN prod.categories cats WHERE " +
            "(COALESCE(:categories) IS NULL OR cats IN :categories) AND " +
            "LOWER(prod.name) like LOWER(CONCAT('%',:name,'%'))")
    Page<Product> findAllPaged(List<Category> categories, String name, Pageable pageable);

}
