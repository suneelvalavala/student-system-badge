package com.telusuko.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.telusuko.entities.Users;
import com.telusuko.repository.UserDetailsRepository;



@Service
public class CustomUserDetailsService  implements UserDetailsService{
	
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return userDetailsRepository.findByUsername(username)
				.orElseThrow(()->new UsernameNotFoundException("Username not found"));
	}

}
