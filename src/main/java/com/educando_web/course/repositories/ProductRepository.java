package com.educando_web.course.repositories;

import com.educando_web.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{


}
