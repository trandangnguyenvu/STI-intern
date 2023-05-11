package com.sti.intern.service;

import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;


import com.sti.intern.entity.User;
import com.sti.intern.model.dto.UserDto;

@Service
public interface UserService {
	public UserDto getUser(OAuth2User user);
}
