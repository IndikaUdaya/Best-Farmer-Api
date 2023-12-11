package com.indikaudaya.bestfarmer.controllers;

import com.indikaudaya.bestfarmer.entities.Product;
import com.indikaudaya.bestfarmer.services.DefaultProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/default/product")
public class DefaultProductViewNotAuthenticate {
    @Autowired
    DefaultProductService defaultProductService;

    @GetMapping
    public List<Product> getDefaultAllProduct() {
        return defaultProductService.getAllProduct();
    }
}
