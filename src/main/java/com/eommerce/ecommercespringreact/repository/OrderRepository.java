package com.eommerce.ecommercespringreact.repository;

import com.eommerce.ecommercespringreact.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel ="order",path="orders")
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findAllByOrderByIdAsc();
    List<Order> findOrderByEmail(String email);
}
