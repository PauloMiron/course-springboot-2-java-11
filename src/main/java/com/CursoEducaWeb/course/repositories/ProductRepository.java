package com.CursoEducaWeb.course.repositories;

import com.CursoEducaWeb.course.entities.Category;
import com.CursoEducaWeb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
