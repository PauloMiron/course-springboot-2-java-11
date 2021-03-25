package com.CursoEducaWeb.course.services;

import com.CursoEducaWeb.course.entities.Category;
import com.CursoEducaWeb.course.entities.Product;
import com.CursoEducaWeb.course.repositories.CategoryRepository;
import com.CursoEducaWeb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired // Injeccao de dependecia
    private ProductRepository repository;

    public List<Product> fildAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
      Optional<Product> obj = repository.findById(id) ;
      return obj.get();
    }

}
