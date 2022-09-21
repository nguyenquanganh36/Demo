package com.anhnq.storedemo.service;

import java.util.ArrayList;

import com.anhnq.storedemo.dto.UserDTO;
import com.anhnq.storedemo.entity.UserEntity;
import com.anhnq.storedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder bcryptEncoder;
	@Override
	public UserDetailImpl loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findByUsername(username);
		if (userEntity == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return UserDetailImpl.build(userEntity);
	}

	public UserEntity save(UserDTO userDTO) {
		UserEntity newUser = new UserEntity();
		newUser.setUsername(userDTO.getUsername());
		newUser.setPassword(bcryptEncoder.encode(userDTO.getPassword()));
		newUser.setEmail(userDTO.getEmail());
		return userRepository.save(newUser);
	}
}