package com.CursoEducaWeb.course.services;

import com.CursoEducaWeb.course.entities.Order;
import com.CursoEducaWeb.course.entities.User;
import com.CursoEducaWeb.course.repositories.OrderRepository;
import com.CursoEducaWeb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired // Injeccao de dependecia
    private OrderRepository repository;

    public List<Order> fildAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
      Optional<Order> obj = repository.findById(id) ;
      return obj.get();
    }

}
