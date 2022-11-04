package com.example.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Documents.Periodo;
import com.example.demo.Repositorios.PeriodoRepository;
import com.example.demo.Services.PeriodoService;

public class PeriodoServiceImpl implements PeriodoService {

	@Autowired
	private PeriodoRepository periodoRepository;
	
	@Override
	public List<Periodo> listarTodos() {
		return this.periodoRepository.findAll();
	}

	@Override
	public Periodo listarPorId(String id) {
		return this.periodoRepository.findOne(id);
	}

	@Override
	public Periodo cadastrar(Periodo periodo) {
		return this.periodoRepository.save(periodo);
	}

	@Override
	public Periodo atualizar(Periodo periodo) {
		return this.periodoRepository.save(periodo);
	}

	@Override
	public void remover(String id) {
		return this.periodoRepository.delete(id);

	}

}
