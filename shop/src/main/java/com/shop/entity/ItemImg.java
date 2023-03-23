package com.shop.entity;

import lombok.Getter;

import javax.persistence.*;

@Table(name = "item_img")
@Getter
@Entity
public class ItemImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_img_id")
    private Long id;

    private String imgName;

    private String oriName;

    private String imgUrl;

    private String thumbnailImg;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;


}
