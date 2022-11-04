package com.example.demo.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

	Cliente findOne(String id);

	Object delete(String id);

}
