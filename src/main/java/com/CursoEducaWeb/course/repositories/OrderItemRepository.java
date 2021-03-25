package com.CursoEducaWeb.course.repositories;

import com.CursoEducaWeb.course.entities.OrderItem;
import com.CursoEducaWeb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
