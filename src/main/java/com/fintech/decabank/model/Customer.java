package com.fintech.decabank.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    @NotNull
    private String password;
    @Column(unique = true, nullable = false)
    private String role;


   /* private String firstName;
    private String lastName;
    private String phoneNumber;
    private String gender;
   */

}
