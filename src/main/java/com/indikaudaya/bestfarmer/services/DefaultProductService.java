package com.indikaudaya.bestfarmer.services;

import com.indikaudaya.bestfarmer.entities.Product;
import com.indikaudaya.bestfarmer.repositories.DefaultProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultProductService {

    @Autowired
    DefaultProductRepository defaultProductRepository;

   public List<Product> getAllProduct(){
       return defaultProductRepository.findAll();
   }
}
