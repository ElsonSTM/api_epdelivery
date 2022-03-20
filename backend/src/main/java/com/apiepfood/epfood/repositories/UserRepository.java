package com.apiepfood.epfood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiepfood.epfood.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
