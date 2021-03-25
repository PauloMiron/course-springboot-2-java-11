package com.CursoEducaWeb.course.services;

import com.CursoEducaWeb.course.entities.Category;
import com.CursoEducaWeb.course.entities.User;
import com.CursoEducaWeb.course.repositories.CategoryRepository;
import com.CursoEducaWeb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired // Injeccao de dependecia
    private CategoryRepository repository;

    public List<Category> fildAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
      Optional<Category> obj = repository.findById(id) ;
      return obj.get();
    }

}
