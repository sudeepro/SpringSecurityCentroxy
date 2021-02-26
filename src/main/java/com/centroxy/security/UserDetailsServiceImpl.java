package com.centroxy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.centroxy.entity.UserEntity;
import com.centroxy.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (username == null || username.isEmpty()) {
			log.warn("username not found" + username);
			throw new UsernameNotFoundException("username not found");

		}

		UserEntity users = repository.findUserNameByEmail(username);
		log.info("username found" + username);

		MyUserDetails user = new MyUserDetails(users);

		return user;
	}

}
