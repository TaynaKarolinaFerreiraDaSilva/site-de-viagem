package com.example.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Documents.Classe;
import com.example.demo.Repositorios.ClasseRepository;
import com.example.demo.Services.ClasseService;

public class ClasseServiceImpl implements ClasseService {
	
	@Autowired
	private ClasseRepository classeRepository;

	@Override
	public List<Classe> listarTodos() {
		return this.classeRepository.findAll();
	}

	@Override
	public Classe listarPorId(String id) {
		return this.classeRepository.findOne(id);
	}

	@Override
	public Classe cadastrar(Classe classe) {
		return this.classeRepository.save(classe);
	}

	@Override
	public Classe atualizar(Classe classe) {
		return this.classeRepository.save(classe);
	}

	@Override
	public void remover(String id) {
		return this.classeRepository.delete(id);

	}

}
