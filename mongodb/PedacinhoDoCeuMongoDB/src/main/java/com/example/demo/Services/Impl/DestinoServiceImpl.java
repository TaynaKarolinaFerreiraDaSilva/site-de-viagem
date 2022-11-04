package com.example.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Documents.Destino;
import com.example.demo.Repositorios.DestinoRepository;
import com.example.demo.Services.DestinoService;
@Service
public class DestinoServiceImpl implements DestinoService {
	
	@Autowired
	private DestinoRepository destinoRepository;

	@Override
	public List<Destino> listarTodos() {
		return this.destinoRepository.findAll();
	}
	@Override
	public Destino listarPorId(String id) {
		return this.destinoRepository.findOne(id);
	}

	@Override
	public Destino cadastrar(Destino destino) {
		return this.destinoRepository.save(destino);
	}

	@Override
	public Destino atualizar(Destino destino) {
		return this.destinoRepository.save(destino);
	}

	@Override
	public void remover(String id) {
		return this.destinoRepository.delete(id);

	}

}
