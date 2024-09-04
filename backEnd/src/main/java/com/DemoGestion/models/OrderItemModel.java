package com.DemoGestion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemModel {
    private long orderId;
    private long quantity;
    private double price;
    private List<OrderProductModel> product = new ArrayList<>();

}
