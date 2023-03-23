package com.shop.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Table(name = "member")
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long Id;

    private String name;

    private String password;

    @Column(unique = true)
    private String email;

    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;


}
