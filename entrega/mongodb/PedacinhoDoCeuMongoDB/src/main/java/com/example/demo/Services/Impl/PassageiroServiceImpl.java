package com.example.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Documents.Passageiro;
import com.example.demo.Repositorios.PassageiroRepository;
import com.example.demo.Services.PassageiroService;

public class PassageiroServiceImpl implements PassageiroService {

	@Autowired
	private PassageiroRepository passageiroRepository;
	@Override
	public List<Passageiro> listarTodos() {
		return this.passageiroRepository.findAll();
	}

	@Override
	public Passageiro listarPorId(String id) {
		return this.passageiroRepository.findOne(id);
	}

	@Override
	public Passageiro cadastrar(Passageiro passageiro) {
		return this.passageiroRepository.save(passageiro);
	}

	@Override
	public Passageiro atualizar(Passageiro passageiro) {
		return this.passageiroRepository.save(passageiro);
	}

	@Override
	public void remover(String id) {
		return this.passageiroRepository.delete(id);

	}

}
