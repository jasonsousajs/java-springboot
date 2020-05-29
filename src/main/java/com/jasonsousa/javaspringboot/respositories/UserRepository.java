package com.jasonsousa.javaspringboot.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasonsousa.javaspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
