package com.DemoGestion.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("1") // dans Person (classe extend) , si le person_type est à 1 alors ce sera un provider
@EqualsAndHashCode(callSuper = false) //
public class Provider extends Person implements Serializable {
    private String raisonSociale;
    private String accountBank;


}