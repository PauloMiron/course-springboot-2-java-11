package com.CursoEducaWeb.course.services;

import com.CursoEducaWeb.course.entities.User;
import com.CursoEducaWeb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired // Injeccao de dependecia
    private UserRepository repository;

    public List<User> fildAll(){
        return repository.findAll();
    }

    public User findById(Long id){
      Optional<User> obj = repository.findById(id) ;
      return obj.get();
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
