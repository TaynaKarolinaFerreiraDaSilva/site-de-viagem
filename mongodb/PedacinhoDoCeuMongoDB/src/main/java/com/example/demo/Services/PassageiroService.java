package com.example.demo.Services;

import java.util.List;

import com.example.demo.Documents.Passageiro;

public interface PassageiroService {
	
	List<Passageiro> listarTodos();

	Passageiro listarPorId(String id);

	Passageiro cadastrar(Passageiro passageiro);

	Passageiro atualizar(Passageiro passageiro);

	void remover(String id);

}
