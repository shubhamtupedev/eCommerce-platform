package com.ecommerce.userservice.repository;

import com.ecommerce.userservice.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long>, PagingAndSortingRepository<Users, Long> {

    public Optional<Users> findByUsernameAndEmail(String username, String email);

}
