package com.DemoGestion.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {

    private long id;
    private Date date;
    private double mountTotal;
    private double payment;
    private long clientId;

}
