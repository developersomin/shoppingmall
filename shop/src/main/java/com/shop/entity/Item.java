package com.shop.entity;

import lombok.Getter;

import javax.persistence.*;

@Table(name = "item")
@Getter
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    private String itemName;

    private int price;

    private int stockQuantity;

    private String Detail;

    @Lob//데이터베이스에서 255 이상
    private ItemSellStatus itemSellStatus;

}
