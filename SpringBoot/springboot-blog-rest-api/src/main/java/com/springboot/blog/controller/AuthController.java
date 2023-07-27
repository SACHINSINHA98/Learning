//package com.springboot.blog.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.springboot.blog.DTO.JwtAuthResponse;
//import com.springboot.blog.DTO.LoginDto;
//import com.springboot.blog.DTO.RegisterDto;
//import com.springboot.blog.service.AuthService;
//
//@RestController()
//@RequestMapping("/api/auth")
//public class AuthController {
//	AuthService authService;
//
//	
//	public AuthController(AuthService authService) {
//		this.authService = authService;
//	}
//	@PostMapping(value= {"/login","/sigin"})
//	ResponseEntity<JwtAuthResponse>login(@RequestBody LoginDto loginDto){
//		String token= authService.login(loginDto);
//		JwtAuthResponse jwtAuthResponse= new JwtAuthResponse();
//		jwtAuthResponse.setAccessToken(token);
//		return  ResponseEntity.ok(jwtAuthResponse);
//	}
//	@PostMapping(value= {"/signup","/register"})
//	ResponseEntity<String>login(@RequestBody RegisterDto registerDto){
//		String response= authService.register(registerDto);
//		return  new ResponseEntity<String>(response, HttpStatus.CREATED);
//	}
//}
