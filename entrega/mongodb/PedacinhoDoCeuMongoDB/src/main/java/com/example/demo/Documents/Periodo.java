package com.example.demo.Documents;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Periodo {
	@Id
	private String id;
	private String DuracaoViagem;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@NotEmpty(message = "Período não pode ser vazio")
	public String getDuracaoViagem() {
		return DuracaoViagem;
	}
	public void setDuracaoViagem(String duracaoViagem) {
		DuracaoViagem = duracaoViagem;
	}
	
	

}
