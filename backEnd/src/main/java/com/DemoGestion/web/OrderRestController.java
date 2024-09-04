package com.DemoGestion.web;


import com.DemoGestion.entities.Order;
import com.DemoGestion.models.OrderModel;
import com.DemoGestion.services.OrderService;
import com.DemoGestion.services.PersonService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderRestController {

    private OrderService orderService;
    private  PersonService personService; // pour récup le client

    @PostMapping("/orders")
    void saveOrder(@RequestBody OrderModel orderModel){

        Order order = new Order();

        //On garde la logique des informations d'une commande
        order.setClient(personService.findOneClientById(orderModel.getClientId()));
        order.setDate(new Date());
        order.setPayment(null);
        order.setMountTotal(0);
        orderService.createOrder(order);
    }

    @GetMapping("/orders")
    List<Order> findAll(){
        return this.orderService.findAll();
    }

}
