package com.springboot.blog.DTO;

import java.util.Set;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class PostDto {
	private Long id;
	@NotEmpty
	@Size(min = 2, message="post title should have atleast two characters")
	private String title;
	@NotEmpty
	@Size(min = 10, message="post title should have atleast five characters")
	private String description;
	@NotEmpty
	private String content;
	private Set<CommentDto>comments;
}
