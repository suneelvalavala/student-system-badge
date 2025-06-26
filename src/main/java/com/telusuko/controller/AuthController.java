package com.telusuko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusuko.entities.AuthRequest;
import com.telusuko.util.JWTUtil;


@RestController
public class AuthController {
	
    @Autowired
    AuthenticationManager authenticationManager;
    
    @Autowired
    JWTUtil jwtUtil;
    
    @PostMapping("/authenticate")
   
    public String generateToken(@RequestBody AuthRequest authRequest){
    	 
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

            return jwtUtil.generateToken(authRequest.getUsername());

        }catch (Exception e){
            throw e;
        }
    }
}