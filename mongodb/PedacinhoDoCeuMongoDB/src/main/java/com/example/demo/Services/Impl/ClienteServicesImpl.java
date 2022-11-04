package com.example.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Documents.Cliente;
import com.example.demo.Repositorios.ClienteRepository;
import com.example.demo.Services.ClienteService;
@Service
public class ClienteServicesImpl implements ClienteService {
	

@Autowired
private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente listarPorId(String id) {
return this.clienteRepository.findOne(id);
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover ( String id) {
		return this.clienteRepository.delete(id);

	}

}
