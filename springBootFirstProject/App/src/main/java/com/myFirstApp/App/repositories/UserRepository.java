package com.myFirstApp.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myFirstApp.App.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
