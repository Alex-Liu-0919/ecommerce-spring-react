package com.eommerce.ecommercespringreact.repository;

import com.eommerce.ecommercespringreact.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel ="user",path="users")
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByOrderByIdAsc();

    User findByActivationCode(String code);

    User findByEmail(String email);

    User findByPasswordResetCode(String code);
}
