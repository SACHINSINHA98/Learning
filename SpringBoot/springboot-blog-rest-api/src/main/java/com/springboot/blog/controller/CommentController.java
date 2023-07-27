package com.springboot.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.DTO.CommentDto;
import com.springboot.blog.service.CommentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CommentController {
	@Autowired
CommentService commentService;
@PostMapping("/posts/{post_id}/comments")
ResponseEntity<CommentDto> postComment( @PathVariable Long post_id,@Valid@RequestBody CommentDto commentDto){
	return new  ResponseEntity<>(commentService.postComment(post_id,commentDto), HttpStatus.CREATED);
}
@GetMapping("/posts/{post_id}/comments")
ResponseEntity<List<CommentDto>> getAllCommentsByPostId( @PathVariable Long post_id){
	return new  ResponseEntity<>(commentService.getAllCommentsByPostId(post_id), HttpStatus.OK);
	 
}
@GetMapping("/posts/{post_id}/comments/{commentId}")
ResponseEntity<CommentDto> postComment( @PathVariable Long post_id,@PathVariable Long commentId){
	return new  ResponseEntity<>(commentService.getCommentsByPostId(post_id,commentId), HttpStatus.OK);
}

@PutMapping("/posts/{post_id}/comments/{commentId}")
ResponseEntity<CommentDto> updateComment( @PathVariable Long post_id,@PathVariable Long commentId,@Valid@RequestBody CommentDto commentDto){
	return new  ResponseEntity<>(commentService.UpdateCommentById(post_id, commentId, commentDto), HttpStatus.OK);
}	
@DeleteMapping("/posts/{post_id}/comments/{commentId}")
ResponseEntity<String> deleteComment( @PathVariable Long post_id,@PathVariable Long commentId){
	commentService.delete(post_id, commentId);
	return new  ResponseEntity<>("comment deleted successfully", HttpStatus.OK);
}
}
