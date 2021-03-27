package com.helloKoding.account.repository;

import com.helloKoding.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> 
{
    User findByUsername(String username);
}
