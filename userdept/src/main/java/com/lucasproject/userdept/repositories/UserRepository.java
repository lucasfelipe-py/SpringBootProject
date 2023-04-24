package com.lucasproject.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasproject.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
