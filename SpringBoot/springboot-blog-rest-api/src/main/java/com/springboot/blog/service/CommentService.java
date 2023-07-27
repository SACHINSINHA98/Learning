package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.DTO.CommentDto;

public interface CommentService {
CommentDto postComment(Long post_id ,CommentDto commentdto);
List<CommentDto> getAllCommentsByPostId(Long post_id);
CommentDto getCommentsByPostId(Long post_id,Long commentId);
CommentDto UpdateCommentById(Long post_id,Long commentId, CommentDto commentDto);
void delete(Long post_id,Long commentId);
}
