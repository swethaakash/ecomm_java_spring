package com.ecomm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.models.UserSession;

@Repository
public interface SessionDao extends JpaRepository<UserSession, Integer>{
	
	Optional<UserSession> findByToken(String token);
	
	Optional<UserSession> findByUserId(Integer userId);
	
}
