package com.example.demo.Documents;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Classe {
	
	@Id
	private String id;
	private String economica;
	private String ExecutivaBussines;
	private String PrimeiraClasse;
	private String PremiumEconomica;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@NotEmpty(message = "Classe não pode ser vazio")
	public String getEconomica() {
		return economica;
	}
	public void setEconomica(String economica) {
		this.economica = economica;
	}
	@NotEmpty(message = "Classe não pode ser vazio")
	public String getExecutivaBussines() {
		return ExecutivaBussines;
	}
	public void setExecutivaBussines(String executivaBussines) {
		ExecutivaBussines = executivaBussines;
	}
	@NotEmpty(message = "Classe não pode ser vazio")
	public String getPrimeiraClasse() {
		return PrimeiraClasse;
	}
	public void setPrimeiraClasse(String primeiraClasse) {
		PrimeiraClasse = primeiraClasse;
	}
	@NotEmpty(message = "Classe não pode ser vazio")
	public String getPremiumEconomica() {
		return PremiumEconomica;
	}
	public void setPremiumEconomica(String premiumEconomica) {
		PremiumEconomica = premiumEconomica;
	}
	
	

}
