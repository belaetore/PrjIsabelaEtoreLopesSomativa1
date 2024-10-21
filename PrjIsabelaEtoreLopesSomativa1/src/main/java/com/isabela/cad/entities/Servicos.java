package com.isabela.cad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicos")
public class Servicos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeServico;
	private String tipoServico;
	private int precoServico;
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String nomeServico() {
		return nomeServico;
	}
	
	public void setnomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	
	public String gettipoServico() {
		return tipoServico;
	}
	
	public void settipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public int getprecoServico(){
		return precoServico;
	}
	
	public void setprecoServico(int precoServico) {
		this.precoServico = precoServico;
	}
	
}