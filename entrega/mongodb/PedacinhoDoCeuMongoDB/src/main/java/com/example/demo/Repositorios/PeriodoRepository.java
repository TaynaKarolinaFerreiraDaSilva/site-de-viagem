package com.example.demo.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Documents.Periodo;

public interface PeriodoRepository extends MongoRepository<Periodo, String> {

}
