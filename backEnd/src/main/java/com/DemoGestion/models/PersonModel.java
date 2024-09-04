package com.DemoGestion.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonModel {
    private String name;
    private String email;
    private String adress;
    private String telephone;
    private String code;
    private String raisonSociale;
    private String birthday;
    private String accountBank;

}
