package com.test.test1.repo;

import com.test.test1.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CartRepo extends JpaRepository<Cart, UUID> {
}
