package com.indikaudaya.bestfarmer.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private double qty;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Delivery> deliveryList;

    @OneToMany(mappedBy = "products")
    private List<Watchlist> watchlistList;

    @OneToMany(mappedBy = "products")
    private List<Cart>  carts;

    public Product() {
    }

}
