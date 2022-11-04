package com.example.demo.Documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Passageiro {

	@Id
	private String id;
	private String Adulto;
	private String Menores;
	private String TipoClasse;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAdulto() {
		return Adulto;
	}
	public void setAdulto(String adulto) {
		Adulto = adulto;
	}
	public String getMenores() {
		return Menores;
	}
	public void setMenores(String menores) {
		Menores = menores;
	}
	public String getTipoClasse() {
		return TipoClasse;
	}
	public void setTipoClasse(String tipoClasse) {
		TipoClasse = tipoClasse;
	}
	
	
}
