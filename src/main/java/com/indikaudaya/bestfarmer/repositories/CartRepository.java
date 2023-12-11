package com.indikaudaya.bestfarmer.repositories;

import com.indikaudaya.bestfarmer.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
