package com.example.demo.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Documents.Passageiro;

public interface PassageiroRepository extends MongoRepository<Passageiro, String> {

}
