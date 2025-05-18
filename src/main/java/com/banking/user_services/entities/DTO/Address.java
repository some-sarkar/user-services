package com.banking.user_services.entities.DTO;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Address {

    private String street;
    private String area;
    private String city;
    private String district;
    private String state;
    private int pinCode;

}
