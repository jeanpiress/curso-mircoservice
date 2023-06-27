package com.jeanpiress.hruser.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanpiress.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
