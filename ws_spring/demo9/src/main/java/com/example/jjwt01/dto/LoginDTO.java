package com.example.jjwt01.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginDTO {
	private String username;
	private String password;
	private String name;
	private String role;
}
