package com.springboot.blog.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

	private long id;
	@NotEmpty(message = " name should not be null or empty")
	private String name;
	@NotEmpty(message="email should not be empty or null")
	@Email
	private String email;
	@NotEmpty
	@Size(min = 10, message="comment body must be minimum 10 characters")
	private String body;
	

}