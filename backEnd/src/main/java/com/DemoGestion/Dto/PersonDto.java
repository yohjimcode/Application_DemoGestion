package com.DemoGestion.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private String name;
    private String email;
    private String adress;
    private String telephone;
    private String code;
    private String raisonSociale;
    private String birthday;
    private String accountBank;

}
