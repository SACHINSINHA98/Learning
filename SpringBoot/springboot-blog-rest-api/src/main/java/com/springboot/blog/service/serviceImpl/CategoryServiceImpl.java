package com.springboot.blog.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.blog.DTO.CategoryDto;
import com.springboot.blog.entity.Category;
import com.springboot.blog.repository.CategoryRepository;
import com.springboot.blog.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
	CategoryRepository categoryRepository;
	ModelMapper mapper;
	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper mapper) {
		this.categoryRepository = categoryRepository;
		this.mapper = mapper;
	}


	@Override
	public CategoryDto addCategory(CategoryDto categoryDto) {
		Category category=  mapToEntity(categoryDto);
		return mapToDto(categoryRepository.save(category));
	}
	
	
	private Category mapToEntity(CategoryDto categoryDto) {
		Category category= mapper.map(categoryDto, Category.class);
		return category;
	}
	private CategoryDto mapToDto(Category category) {
		CategoryDto categoryDto= mapper.map(category, CategoryDto.class);
		return categoryDto;
	}

}
