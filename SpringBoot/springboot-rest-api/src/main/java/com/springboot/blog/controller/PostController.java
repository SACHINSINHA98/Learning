package com.springboot.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.DTO.PostDto;
import com.springboot.blog.DTO.PostResponse;
import com.springboot.blog.entity.Post;
import com.springboot.blog.service.PostService;
import com.springboot.blog.utils.AppConstants;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	PostService postService;

	@Autowired
	public PostController(PostService postService) {
       this.postService = postService;
	}
 @PostMapping("/")
	ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
		return new ResponseEntity<PostDto>(postService.createPost(postDto),HttpStatus.CREATED);
}
 @GetMapping("/")
 ResponseEntity<List<PostDto>>getAllPost(){
	 return new ResponseEntity<List<PostDto>>(postService.getAllPost(),HttpStatus.OK);
 }
 @GetMapping("/{id}")
 ResponseEntity <PostDto> getPostById(@PathVariable Long id){
	 return new ResponseEntity<PostDto>(postService.findById(id),HttpStatus.OK);
 }
 @GetMapping("/page")
 ResponseEntity<PostResponse>getAllPostinPage(@RequestParam (required = false,defaultValue = AppConstants.DEFAULT_PAGE_NUMBER)int pageNo,
		 @RequestParam (required = false,defaultValue = AppConstants.DEFAULT_PAGE_SIZE)int pageSize,
		 @RequestParam(required = false,defaultValue = AppConstants.DEFAULT_SORT_BY)String sortBy,
		 @RequestParam(required = false,defaultValue = AppConstants.DEFAULT_SORT_DIR)String sortDir
		 ){
	 return new ResponseEntity<PostResponse>(postService.getAllPostPagination(pageNo,pageSize,sortBy,sortDir),HttpStatus.OK);
 }
 @PutMapping("/{id}")
 ResponseEntity <PostDto> updatePost(@RequestBody PostDto postDto,@PathVariable Long id){
	return new ResponseEntity<PostDto>( postService.updatePost(postDto, id),HttpStatus.OK);
 }
 @DeleteMapping("/{id}")
 ResponseEntity <String> updatePost(@PathVariable Long id){
	 postService.deletePost(id);
	return new ResponseEntity<String>( "Entity deleted succesfully", HttpStatus.OK);
 }
}
