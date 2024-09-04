package com.DemoGestion.services;

import com.DemoGestion.entities.Category;
import com.DemoGestion.entities.OrderItem;

import java.util.List;

public interface OrderItemService {

    void createOrderItem(OrderItem orderItem);

    List<OrderItem> findAll();

    void deleteOrderItem(long id);

    void editOrderItem(OrderItem orderItem, long id);

    void deleteAll();

}
