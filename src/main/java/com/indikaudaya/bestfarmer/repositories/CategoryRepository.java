package com.indikaudaya.bestfarmer.repositories;

import com.indikaudaya.bestfarmer.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
