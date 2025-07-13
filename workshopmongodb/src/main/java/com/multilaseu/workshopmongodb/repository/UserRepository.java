package com.multilaseu.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.multilaseu.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
