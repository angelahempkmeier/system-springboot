package com.angie.system.repositories;

import com.angie.system.entities.Order;
import com.angie.system.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
