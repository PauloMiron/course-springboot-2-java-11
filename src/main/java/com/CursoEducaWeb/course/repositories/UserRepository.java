package com.CursoEducaWeb.course.repositories;

import com.CursoEducaWeb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
