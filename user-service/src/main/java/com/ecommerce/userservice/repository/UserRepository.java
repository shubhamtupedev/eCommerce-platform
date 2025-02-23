package com.ecommerce.userservice.repository;

import com.ecommerce.userservice.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends JpaRepository<Users, Long>, PagingAndSortingRepository<Users, Long> {
}
