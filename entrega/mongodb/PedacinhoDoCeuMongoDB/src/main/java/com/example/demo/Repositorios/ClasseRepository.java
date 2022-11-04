package com.example.demo.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Documents.Classe;

public interface ClasseRepository extends MongoRepository<Classe, String> {

}
