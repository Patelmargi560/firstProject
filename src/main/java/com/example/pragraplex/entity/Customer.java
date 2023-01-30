package com.example.pragraplex.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private String phone;
    @Column(unique = true)
    private String login;
    private String passWord;
    @Transient
    private boolean isLoggedIn;
    private Date createDate;
    private Date updateDate;

}
