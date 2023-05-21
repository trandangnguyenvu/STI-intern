package com.sti.intern.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
public class UserDto {
	private Long userID;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String avatar;
}
