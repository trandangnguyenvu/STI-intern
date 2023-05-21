package com.sti.intern.service;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

import com.sti.intern.entity.AppUser;
import com.sti.intern.entity.User;
import com.sti.intern.model.dto.UserDto;
import com.sti.intern.model.mapper.UserMapper;

@Component
public class UserServiceImpl implements UserService {

	@Override // xoa di
	public UserDto getUser(OAuth2User user) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public UserDto getUser(OAuth2User user) {
//		// this is fullname
//		String name = user.getAttribute("name");
//        String email = user.getAttribute("email");
//        String[] nameArray = name.split(" ");
//        AppUser usr = new AppUser();
//        usr.setMail(email);
//        // this is first name
//        usr.setUserName(nameArray[nameArray.length-1]);
//        String[] lastNameArray = new String[nameArray.length-1];
//        for (int i = 0; i <= nameArray.length-2; i++) {
//        	lastNameArray[i] = nameArray[i];
//        }
//        String lastName = Arrays.toString(lastNameArray);
//        usr.setUserLastName(lastName);
//        
//        return UserMapper.toUserDto(usr);
//		
//	}

}
