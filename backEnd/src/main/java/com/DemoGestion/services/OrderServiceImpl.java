package com.DemoGestion.services;

import com.DemoGestion.entities.Order;
import com.DemoGestion.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements  OrderService{

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(Order order) {
        this.orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public void deleteOrder(long id) {
        this.orderRepository.deleteById(id);
    }

    @Override
    public Order editOrder(Order order, long id) {
        Order o = this.orderRepository.getReferenceById(id);
        o.setMountTotal(order.getMountTotal());
        o.setPayment(order.getPayment());
        this.orderRepository.save(o);
        return o;
    }

    @Override
    public Order findOrder(long id) {
        return this.orderRepository.getReferenceById(id);
    }
}
