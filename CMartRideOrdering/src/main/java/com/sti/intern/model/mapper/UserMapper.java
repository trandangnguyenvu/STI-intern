package com.sti.intern.model.mapper;

import com.sti.intern.entity.User;
import com.sti.intern.model.dto.UserDto;

public class UserMapper {
	public static UserDto toUserDto(User user) {
		UserDto tmp = new UserDto();
//		tmp.setId(user.getId());
		tmp.setFirstName(user.getUserName());
		tmp.setLastName(user.getUserLastName());
		tmp.setEmail(user.getMail());
		tmp.setPhone(user.getPhone());
		tmp.setAvatar(user.getImage());
		
		return tmp;
	}
}
