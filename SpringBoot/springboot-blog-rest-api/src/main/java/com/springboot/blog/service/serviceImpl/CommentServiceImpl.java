package com.springboot.blog.service.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.blog.DTO.CommentDto;
import com.springboot.blog.entity.Comment;
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.BlogApiException;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.repository.CommentRepository;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	private CommentRepository commentRepository;
	private PostRepository postRepository;
	private ModelMapper modelMapper;

	@Autowired
	public CommentServiceImpl(CommentRepository commentRepository, ModelMapper modelMapper,
			PostRepository postRepository) {
		this.commentRepository = commentRepository;
		this.modelMapper = modelMapper;
		this.postRepository = postRepository;

	}

	@Override
	public List<CommentDto> getAllCommentsByPostId(Long post_id) {
		
		List<Comment> findByPostId = commentRepository.findByPostId(post_id);
		return findByPostId.stream().map(comment -> mapToDto(comment)).collect(Collectors.toList());
	}

	@Override
	public CommentDto postComment(Long post_id, CommentDto commentdto) {
		Comment convertedToEntity = mapToEntity(commentdto);
		Post post = postRepository.findById(post_id)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", post_id));
		convertedToEntity.setPost(post);
		Comment saveconvertedToEntity = commentRepository.save(convertedToEntity);
		mapToDto(saveconvertedToEntity);
		return mapToDto(saveconvertedToEntity);
	}
	@Override
	public CommentDto getCommentsByPostId(Long post_id, Long commentId)  {
		Post findByIdPost = postRepository.findById(post_id)
				.orElseThrow(() -> new ResourceNotFoundException("post", "id", post_id));
		Comment commentById= commentRepository.findById(commentId)
				.orElseThrow(()->new ResourceNotFoundException("comment", "id", commentId));
		
		if(!commentById.getPost().getId().equals(findByIdPost.getId())) {
			throw new BlogApiException(HttpStatus.BAD_REQUEST, "comment does not belong to post");
		}
		return mapToDto(commentById);
	}

	@Override
	public CommentDto UpdateCommentById(Long post_id, Long commentId, CommentDto commentDto) {
		Post findByIdPost = postRepository.findById(post_id)
				.orElseThrow(() -> new ResourceNotFoundException("post", "id", post_id));
		Comment commentById= commentRepository.findById(commentId)
				.orElseThrow(()->new ResourceNotFoundException("comment", "id", commentId));
		
		if(!commentById.getPost().getId().equals(findByIdPost.getId())) {
			throw new BlogApiException(HttpStatus.BAD_REQUEST, "comment does not belong to post");
		}
		commentById.setId(commentDto.getId());
		commentById.setName(commentDto.getName());
		commentById.setEmail(commentDto.getEmail());
		commentById.setBody(commentDto.getBody());
		Comment savedUpdatedcomment = commentRepository.save(commentById);
		return mapToDto(savedUpdatedcomment);
	}
	@Override
	public void delete(Long post_id, Long commentId) {
		Post findByIdPost = postRepository.findById(post_id)
				.orElseThrow(() -> new ResourceNotFoundException("post", "id", post_id));
		Comment commentById= commentRepository.findById(commentId)
				.orElseThrow(()->new ResourceNotFoundException("comment", "id", commentId));
		
		if(!commentById.getPost().getId().equals(findByIdPost.getId())) {
			throw new BlogApiException(HttpStatus.BAD_REQUEST, "comment does not belong to post");
		}
		commentRepository.delete(commentById);
		
	}

	private CommentDto mapToDto(Comment comment) {
		CommentDto commentDto = modelMapper.map(comment, CommentDto.class);
		return commentDto;
	}

	private Comment mapToEntity(CommentDto commentDto) {
		Comment comment = modelMapper.map(commentDto, Comment.class);
		return comment;
	}

	


	

}
