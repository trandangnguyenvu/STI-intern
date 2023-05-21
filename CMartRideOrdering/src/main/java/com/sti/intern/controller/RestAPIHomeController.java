package com.sti.intern.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sti.intern.entity.User;
import com.sti.intern.model.dto.UserDto;
import com.sti.intern.service.UserService;

//@RestController
//@RequestMapping("")
public class RestAPIHomeController {
//	@Autowired 
//	private UserService userService;
//	
//	@GetMapping("/restapi-home")
//	public ResponseEntity<?> getUser(@AuthenticationPrincipal OAuth2User user) {
//		UserDto result = userService.getUser(user);
//		return ResponseEntity.ok(result);
//	}
}
