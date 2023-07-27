
package com.springboot.blog.service;

import com.springboot.blog.DTO.LoginDto;
import com.springboot.blog.DTO.RegisterDto;

public interface AuthService {
	String login(LoginDto loginDto);
	String register(RegisterDto regis);
}
