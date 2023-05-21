package com.sti.intern.model.mapper;

import com.sti.intern.entity.AppUser;
import com.sti.intern.entity.User;
import com.sti.intern.model.dto.UserDto;

public class UserMapper {
	public static UserDto toUserDto(AppUser user) {
		UserDto tmp = new UserDto();
//		tmp.setUserID(user.getUserID()); // DO NOT
		tmp.setFirstName(user.getUserFirstName());
		tmp.setLastName(user.getUserLastName());
		tmp.setEmail(user.getMail());
		tmp.setPhone(user.getPhone());
		tmp.setAvatar(user.getImage());
		
		return tmp;
	}
}
