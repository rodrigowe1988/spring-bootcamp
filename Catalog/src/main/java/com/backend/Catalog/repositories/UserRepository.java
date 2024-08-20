package com.backend.Catalog.repositories;

import com.backend.Catalog.entities.Product;
import com.backend.Catalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
