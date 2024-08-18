package com.DemoGestion.repositories;

import com.DemoGestion.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
