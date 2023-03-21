package com.angie.system.repositories;

import com.angie.system.entities.Category;
import com.angie.system.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
