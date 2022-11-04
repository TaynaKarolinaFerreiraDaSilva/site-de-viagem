package com.example.demo.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Documents.Destino;

public interface DestinoRepository extends MongoRepository<Destino, String> {

}
