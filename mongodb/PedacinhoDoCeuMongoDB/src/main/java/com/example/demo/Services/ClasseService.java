package com.example.demo.Services;

import java.util.List;

import com.example.demo.Documents.Classe;

public interface ClasseService {

	List<Classe> listarTodos();

	Classe listarPorId(String id);

	Classe cadastrar(Classe classe);

	Classe atualizar(Classe classe);

	void remover(String id);
}
