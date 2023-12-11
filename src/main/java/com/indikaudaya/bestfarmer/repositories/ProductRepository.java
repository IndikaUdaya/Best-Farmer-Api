package com.indikaudaya.bestfarmer.repositories;

import com.indikaudaya.bestfarmer.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
