package com.shop.entity;

import lombok.Getter;

import javax.persistence.*;

@Table(name = "cart_item")
@Getter
@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    private int count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;


}
