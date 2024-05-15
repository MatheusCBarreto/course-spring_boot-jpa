package com.educando_web.course.repositories;

import com.educando_web.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
