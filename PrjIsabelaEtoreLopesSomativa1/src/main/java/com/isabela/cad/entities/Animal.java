package com.isabela.cad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeAnimal;
	private String tipoAnimal;
	private String racaAnimal;
	private String especieAnimal;
	private int idadeAnimal;
	private String sexoAnimal;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String nomeAnimal() {
		return nomeAnimal;
	}
	
	public void setnomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	
	public String tipoAnimal() {
		return tipoAnimal;
	}
	
	public void settipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	public String racaAnimal() {
		return racaAnimal;
	}
	
	public void setracaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}
	public String especieAnimal() {
		return especieAnimal;
	}
	
	public void setespecieAnimal(String especieAnimal) {
		this.especieAnimal = especieAnimal;
	}
	public int idadeAnimal() {
		return idadeAnimal;
	}
	
	public void setidadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
	public String sexoAnimal() {
		return sexoAnimal;
	}
	
	public void setsexoAnimal(String sexoAnimal) {
		this.sexoAnimal = sexoAnimal;
	}
}
