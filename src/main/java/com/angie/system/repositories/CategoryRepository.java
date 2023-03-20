package com.angie.system.repositories;

import com.angie.system.entities.Category;
import com.angie.system.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
