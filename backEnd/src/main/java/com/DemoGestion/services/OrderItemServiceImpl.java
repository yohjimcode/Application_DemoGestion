package com.DemoGestion.services;

import com.DemoGestion.entities.OrderItem;
import com.DemoGestion.repositories.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItemServiceImpl implements OrderItemService{

    private final OrderItemRepository orderItemRepository;


    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }


    @Override
    public void createOrderItem(OrderItem orderItem) {
        this.orderItemRepository.save(orderItem);
    }

    @Override
    public List<OrderItem> findAll() {
        return this.orderItemRepository.findAll();
    }

    @Override
    public void deleteOrderItem(long id) {
        this.orderItemRepository.deleteById(id);
    }

    @Override
    public void editOrderItem(OrderItem orderItem, long id) {
        OrderItem oi = this.orderItemRepository.getReferenceById(id);
        oi.setOrder(orderItem.getOrder());
        oi.setPrice(orderItem.getPrice());
        oi.setQuantity(orderItem.getQuantity());
        oi.setProduct(orderItem.getProduct());
        this.orderItemRepository.save(orderItem);

    }

    @Override
    public void deleteAll() {
        this.orderItemRepository.deleteAll();
    }
}
