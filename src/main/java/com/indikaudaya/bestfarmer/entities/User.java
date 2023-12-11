package com.indikaudaya.bestfarmer.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String mobile;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Cart> carts;

    @OneToMany(mappedBy = "buyer")
    private List<Delivery> buyerDetails;

    @OneToMany(mappedBy = "seller")
    private List<Delivery> sellerDetails;

    @OneToMany(mappedBy = "user")
    private List<Watchlist> watchlists;

    @OneToMany(mappedBy = "buyer")
    private List<SellerReview> buyerReview;


    public User() {
    }
}
