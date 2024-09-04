package com.DemoGestion.services;

import com.DemoGestion.entities.Order;

import java.util.List;

public interface OrderService {

    void createOrder(Order order);

    List<Order> findAll();

    void deleteOrder(long id);

    Order editOrder(Order order, long id);

    Order findOrder(long id);

}
