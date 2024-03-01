package com.tcs.boot.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.boot.model.User1;

@Repository
public interface UserRepository extends JpaRepository<User1, Integer> {
 
	public Optional<User1> findByUsername(String username);
 
}
