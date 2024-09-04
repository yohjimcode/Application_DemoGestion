package com.DemoGestion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {

    private long id;
    private String title;
    private double price;
    private String code;
    private long CategoryId;
}
