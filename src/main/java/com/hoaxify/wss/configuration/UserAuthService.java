package com.hoaxify.wss.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hoaxify.wss.user.User;
import com.hoaxify.wss.user.UserRepository;

@Service
public class UserAuthService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //usernameim db deki varlığını kontrol edicez
		User inDB=userRepository.findByUsername(username);
		if(inDB==null)
			throw new UsernameNotFoundException("User not found");
		return inDB;
	}

	
}
