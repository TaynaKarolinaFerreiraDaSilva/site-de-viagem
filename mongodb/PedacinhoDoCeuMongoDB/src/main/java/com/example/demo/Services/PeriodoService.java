package com.example.demo.Services;

import java.util.List;

import com.example.demo.Documents.Periodo;

public interface PeriodoService {

	List<Periodo> listarTodos();

	Periodo listarPorId(String id);

	Periodo cadastrar(Periodo  periodo);

	Periodo  atualizar(Periodo  periodo);

	void remover(String id);
}
