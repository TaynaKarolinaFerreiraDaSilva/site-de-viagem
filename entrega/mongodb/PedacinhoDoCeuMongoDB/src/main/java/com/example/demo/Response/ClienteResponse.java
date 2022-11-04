package com.example.demo.Response;

import java.util.List;

public class ClienteResponse<T> {
	private T data;
	private List<String> erros;

	public ClienteResponse(T  data) {
	this.data =data;

	}

	public ClienteResponse(List<String> erros) {
	this.erros = erros;

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}

	}


