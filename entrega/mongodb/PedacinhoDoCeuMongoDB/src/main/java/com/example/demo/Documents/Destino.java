package com.example.demo.Documents;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Destino {
	
	@Id
	private String id;
	private String Ida;
	private String IdaVolta;
	private String Multidestino;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@NotEmpty(message = "Destino não pode ser vazio")
	public String getIda() {
		return Ida;
	}
	public void setIda(String ida) {
		Ida = ida;
	}
	@NotEmpty(message = "Destino não pode ser vazio")
	public String getIdaVolta() {
		return IdaVolta;
	}
	public void setIdaVolta(String idaVolta) {
		IdaVolta = idaVolta;
	}
	@NotEmpty(message = "Destino não pode ser vazio")
	public String getMultidestino() {
		return Multidestino;
	}
	public void setMultidestino(String multidestino) {
		Multidestino = multidestino;
	}
	
	
}
