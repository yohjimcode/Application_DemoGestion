package com.DemoGestion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("2") //
@EqualsAndHashCode(callSuper = false) //
public class Client extends Person implements Serializable {
    private String code;
    private String birthDay;

}
