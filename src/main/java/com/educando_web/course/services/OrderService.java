package com.educando_web.course.services;

import com.educando_web.course.entities.Order;
import com.educando_web.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> orderId = repository.findById(id);
        return orderId.get();
    }
}
