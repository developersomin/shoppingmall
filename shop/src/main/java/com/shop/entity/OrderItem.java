package com.shop.entity;

import lombok.Getter;

import javax.persistence.*;

@Table(name = "order_item")
@Getter
@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int orderPrice;

    private int count;

    @JoinColumn(name = "item_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;

    @JoinColumn(name = "order_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }
}
