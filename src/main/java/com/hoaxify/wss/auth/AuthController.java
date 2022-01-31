package com.hoaxify.wss.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonView;
import com.hoaxify.wss.shared.CurrentUser;
import com.hoaxify.wss.shared.Views;
import com.hoaxify.wss.user.User;
import com.hoaxify.wss.user.UserRepository;

@RestController
public class AuthController {
	@Autowired
	UserRepository userRepository;
		
	@PostMapping("/api/1.0/auth")
	@JsonView(Views.Base.class)
	ResponseEntity<?> handleAuthentication(@CurrentUser User user) {
		return ResponseEntity.ok(user);	  //dönen cevabı oluşturduk
				}
	
	
}
