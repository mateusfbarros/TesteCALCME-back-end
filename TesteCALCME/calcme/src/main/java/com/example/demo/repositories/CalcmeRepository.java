package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Calcme;

public interface CalcmeRepository extends MongoRepository<Calcme, String> {
	
}
