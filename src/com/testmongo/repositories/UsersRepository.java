package com.testmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.testmongo.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, String>{
}