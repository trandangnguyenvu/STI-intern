package com.sti.intern.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



//@Entity
@Getter
@Setter
@Component
@Table(name = "Account")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String account;
	
	private String password;
	
//	@Enumerated(EnumType.STRING)
	@Column(name = "auth_provider")
	private AuthenticationProvider authProvider;
	
	@Column(name = "user_name")
	private String userName;
	
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
		

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String account, String password, AuthenticationProvider authProvider, String userName,
			String userLastName, String gender, Date birth, String role, String phone, String mail, String paymentId,
			String address, String image, String status, boolean enabled) {
		super();
		this.account = account;
		this.password = password;
		this.authProvider = authProvider;
		this.userName = userName;
		this.userLastName = userLastName;
		this.gender = gender;
		this.birth = birth;
		this.role = role;
		this.phone = phone;
		this.mail = mail;
		this.paymentId = paymentId;
		this.address = address;
		this.image = image;
		this.status = status;
		this.enabled = enabled;		
	}
	
	@Transient
	public String getFullName() {
		return userName + " " + userLastName;
	}

}
