package com.thalyta.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thalyta.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
