package com.angie.system.services;

import com.angie.system.entities.Category;
import com.angie.system.repositories.CategoryRepository;
import com.angie.system.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
      Optional<Category> obj = repository.findById(id);
      return obj.get();
    }


}
