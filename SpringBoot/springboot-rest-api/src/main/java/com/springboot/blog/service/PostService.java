package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.DTO.PostDto;
import com.springboot.blog.DTO.PostResponse;

public interface PostService {
 PostDto createPost(PostDto postDto);
 List<PostDto>getAllPost();
 PostDto findById(Long id);
 PostDto updatePost(PostDto postDto, Long id);
 void deletePost(Long id);
 PostResponse getAllPostPagination(int pageNo, int pageSize,String sortBy,String sortDir);
}
