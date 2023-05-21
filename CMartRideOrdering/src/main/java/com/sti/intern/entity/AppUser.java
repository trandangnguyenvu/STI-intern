package com.sti.intern.entity;

import java.util.Date;


import javax.persistence.*;

//import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.stereotype.Component;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
//@Component
@Entity
@Table(name = "Account")
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private Long userId;
	
	// this is account name, not full name
	@Column(name = "account")
	private String userName;
	
	@Column(name = "password")
	private String encrytedPassword;
	
////	@Enumerated(EnumType.STRING)
//	@Column(name = "auth_provider")
//	private AuthenticationProvider authProvider;
	
	// this is first name
	@Column(name = "user_name")
	private String userFirstName;
	
	@Column(name = "user_last_name")
	private String userLastName;
	
	private String gender;
	private Date birth;
	private String role;
	private String phone;
	private String mail;
	
	@Column(name = "payment_ID")
	private String paymentId;
	
	private String address;
	private String image;
	private String status;
	
	@Column(name = "created_time", updatable = false)
	private Date createdTime;
	
	private boolean enabled;
		


	
//	@Transient
//	public String getFullName() {
//		return userLastName + " " + userName;
//	}

}
