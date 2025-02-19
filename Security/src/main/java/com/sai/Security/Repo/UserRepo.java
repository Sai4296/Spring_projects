package com.sai.Security.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.Security.Entity.Users;


@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
	Users findByUsername(String username);
}
