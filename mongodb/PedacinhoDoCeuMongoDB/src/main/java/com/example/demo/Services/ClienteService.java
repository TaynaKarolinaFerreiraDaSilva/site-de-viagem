package com.example.demo.Services;

import java.util.List;

import com.example.demo.Documents.Cliente;

public interface ClienteService {
	
	List<Cliente> listarTodos();

	Cliente listarPorId(String id);

	Cliente cadastrar(Cliente cliente);

	Cliente atualizar(Cliente cliente);

	void remover(String id);

}
