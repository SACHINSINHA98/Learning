
package com.springboot.blog.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor
public class LoginDto {
	private String usernameOrEmail;
	private String password;
}
