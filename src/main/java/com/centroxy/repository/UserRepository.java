package com.centroxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.centroxy.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	
	@Query("SELECT u FROM UserEntity u WHERE u.email= :email")
	public UserEntity findUserNameByEmail(@Param("email") String email);

}
