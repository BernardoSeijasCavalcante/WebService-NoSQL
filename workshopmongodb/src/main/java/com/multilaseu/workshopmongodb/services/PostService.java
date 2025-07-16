package com.multilaseu.workshopmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multilaseu.workshopmongodb.domain.Post;
import com.multilaseu.workshopmongodb.exception.ObjectNotFoundException;
import com.multilaseu.workshopmongodb.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public Post findById(String id) {
		Optional<Post> post = postRepository.findById(id);
		if(post.get() == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return post.get(); 
	}
}
