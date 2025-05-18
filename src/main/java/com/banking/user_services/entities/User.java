package com.banking.user_services.entities;

import com.banking.user_services.entities.DTO.Address;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Long aadhaarNo;
    @Embedded
    private Address address;
    private String panNo;



}
