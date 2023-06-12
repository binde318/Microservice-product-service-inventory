package com.programmingbinde.orderservice.repository;

import com.programmingbinde.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
