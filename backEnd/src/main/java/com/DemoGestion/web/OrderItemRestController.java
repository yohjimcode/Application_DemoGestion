package com.DemoGestion.web;


import com.DemoGestion.entities.Order;
import com.DemoGestion.entities.OrderItem;
import com.DemoGestion.entities.Product;
import com.DemoGestion.models.OrderItemModel;
import com.DemoGestion.models.OrderProductModel;
import com.DemoGestion.services.OrderItemService;
import com.DemoGestion.services.OrderService;
import com.DemoGestion.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderItemRestController {

    private final OrderService orderService;
    private final ProductService productService;
    private final OrderItemService orderItemService;


    public OrderItemRestController(OrderService orderService, ProductService productService, OrderItemService orderItemService) {
        this.orderService = orderService;
        this.productService = productService;
        this.orderItemService = orderItemService;
    }

    @GetMapping("/orders/lines")
    List<OrderItem> findAll(){
        return this.orderItemService.findAll();
    }

    @DeleteMapping("/orders/lines")
    void deleteAll(){this.orderItemService.deleteAll();}

    @PostMapping("/orders/lines")
    Order createLineOrder(@RequestBody OrderItemModel orderItemModel){

        Order order = this.orderService.findOrder(orderItemModel.getOrderId()); //On va chercher la commande
        double total = 0;
        if(order != null){
            // On parcourt l'ensemble des produits (OrderItemModel)
            for(OrderProductModel orderProductModel : orderItemModel.getProduct()){

                OrderItem orderItem = new OrderItem();

                orderItem.setOrder(order); // On récupére la commande qu'on a crée ac le client

                Product product = productService.findProduct(orderProductModel.getId()); //on cherche les products dans la bdd

                orderItem.setProduct(product); //On va chercher tous les product qu'on veut acheter

                orderItem.setPrice(product.getPrice()); // On récupere son prix Unitaire

                orderItem.setQuantity(orderProductModel.getQuantite()); //On selectionne la quantité

                orderItemService.createOrderItem(orderItem); // ON crée la ligne de commande

                total += orderProductModel.getQuantite() * product.getPrice(); // prix unitaire * quantité
            }
            // on met a jour le montant total de la commande
            order.setMountTotal(total);

            return orderService.editOrder(order, order.getId()); //on retourne la commande
        }
        return null;
    }

}
