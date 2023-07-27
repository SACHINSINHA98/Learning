package com.springboot.blog.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.blog.DTO.PostDto;
import com.springboot.blog.DTO.PostResponse;
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	PostRepository postRepository;
	ModelMapper modelMapper;

	@Autowired
	public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper) {
		this.postRepository = postRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public PostDto createPost(@RequestBody PostDto postDto) {
		// convert DTO to entity
		/*
		 * this is done by mapToEntity method Post post= new Post();
		 * post.setTitle(postDto.getTitle()); post.setContent(postDto.getContent());
		 * post.setDescription(postDto.getDescription());
		 */

		Post savedPost = postRepository.save(mapToEntity(postDto));
		PostDto postResponse = mapToDTO(savedPost);
		return postResponse;
	}

	@Override
	public List<PostDto> getAllPost() {

		/*
		 * List<PostDto> convertEntitytoDTO = new ArrayList<>(); List<Post> findAll =
		 * postRepository.findAll(); for (Post post : findAll) { PostDto postdto = new
		 * PostDto(); postdto.setId(post.getId()); postdto.setTitle(post.getTitle());
		 * postdto.setDescription(post.getDescription());
		 * postdto.setContent(post.getContent()); convertEntitytoDTO.add(postdto); }
		 */
		List<Post> findAllposts = postRepository.findAll();
		//findAllposts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
		return findAllposts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
	}


	@Override
	public PostDto findById(Long id) {
		// java 8 technique 
		Post findByIdPost = postRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("post", "id", id));
		return mapToDTO(findByIdPost);

		/*
		 * Optional<Post> findbyidpost = postRepository.findById(id); Post post = null;
		 * if(findbyidpost.isPresent()) { post = findbyidpost.get(); }else { throw new
		 * ResourceNotFoundException("post", "id", id); }
		 * 
		 * return mapToDTO(post);
		 */

	}

	@Override
	public PostDto updatePost(PostDto postDto, Long id) {
		Post findByIdPost = postRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("post", "id", id));
		findByIdPost.setContent(postDto.getContent());
		findByIdPost.setDescription(postDto.getDescription());
		findByIdPost.setTitle(postDto.getTitle());
		Post updatedPost=postRepository.save(findByIdPost);
		return mapToDTO(updatedPost);
	}

	@Override
	public void deletePost(Long id) {
		Post findByIdPost = postRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("post", "id", id));
		postRepository.delete(findByIdPost);
	}

	@Override
	public PostResponse getAllPostPagination(int PageNo, int PageSize,String sortBy,String sortDir) {
		Sort sort= sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortBy).ascending():
			Sort.by(sortBy).descending();
		Pageable pageable=PageRequest.of(PageNo, PageSize, sort);
		Page<Post> findAll = postRepository.findAll(pageable);
		//get content from page
		List<Post> findAllInPage=findAll.getContent();
		List<PostDto> findAllInPageDto = findAllInPage.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
		
		PostResponse postResponse= new PostResponse();
		postResponse.setContent(findAllInPageDto);
		postResponse.setPageNo(findAll.getNumber());
		postResponse.setLast(findAll.isLast());
		postResponse.setTotalElements(findAll.getNumberOfElements());
		postResponse.setTotalPages(findAll.getTotalPages());
		postResponse.setPageSize(findAll.getSize());
		postResponse.setSortby(sortBy);
		postResponse.setSortDir(sortDir);
		return postResponse;
		
	}
	// convert Entity into DTO
		private PostDto mapToDTO(Post post) {
			
			PostDto postdto= modelMapper.map(post, PostDto.class);
			/*
			 * PostDto postdto = new PostDto();
			 * postdto.setId(post.getId()); postdto.setTitle(post.getTitle());
			 * postdto.setDescription(post.getDescription());
			 * postdto.setContent(post.getContent());
			 */
			return postdto;
		}

		// convert DTO into entity
		private Post mapToEntity(PostDto postdto) {
			Post post= modelMapper.map(postdto, Post.class);
			/*
			 * Post post = new Post(); post.setId(postdto.getId());
			 * post.setTitle(postdto.getTitle()); post.setContent(postdto.getContent());
			 * post.setDescription(postdto.getDescription());
			 */
			return post;
		}


}
