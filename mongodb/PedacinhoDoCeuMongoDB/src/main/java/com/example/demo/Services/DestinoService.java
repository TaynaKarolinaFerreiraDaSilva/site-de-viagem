package com.example.demo.Services;

import java.util.List;

import com.example.demo.Documents.Destino;

public interface DestinoService {

	List<Destino> listarTodos();

	Destino listarPorId(String id);

	Destino cadastrar(Destino destino);

	Destino atualizar(Destino destino);

	void remover(String id);
}
