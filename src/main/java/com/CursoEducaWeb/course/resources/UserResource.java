package com.CursoEducaWeb.course.resources;

import com.CursoEducaWeb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> fildAll(){
        User u = new User(1L,"Maria","Maria@gmail.com","9999999","12345678");
        return ResponseEntity.ok().body(u);
    }
}