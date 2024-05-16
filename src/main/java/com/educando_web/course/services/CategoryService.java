package com.educando_web.course.services;

import com.educando_web.course.entities.Category;

import com.educando_web.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> categoryId = repository.findById(id);
        return categoryId.get();
    }
}
