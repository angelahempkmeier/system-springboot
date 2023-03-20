package com.angie.system.repositories;

import com.angie.system.entities.Order;
import com.angie.system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
