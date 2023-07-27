package com.springboot.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.DTO.CategoryDto;
import com.springboot.blog.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	CategoryService categoryService;
	@Autowired
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/addcategory")
 ResponseEntity<CategoryDto> addCategory(@RequestBody CategoryDto categoryDto){
	 return  new ResponseEntity<CategoryDto>(categoryService.addCategory(categoryDto),HttpStatus.CREATED );
 }
	
}
