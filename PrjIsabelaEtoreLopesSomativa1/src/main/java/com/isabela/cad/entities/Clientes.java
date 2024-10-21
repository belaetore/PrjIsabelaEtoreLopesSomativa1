package com.isabela.cad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeCliente;
	private String endereçoCliente;
	private int CPF;
	private String emailCliente;
	private int telefoneCliente;
	

	private String nomeAnimal;
	private String tipoAnimal;
	private String racaAnimal;
	private String especieAnimal;
	private int idadeAnimal;
	private String sexoAnimal;
	private String nomeServico;
	private String tipoServico;
	private int precoServico;
	private String nomeProduto;
	private String tipoProduto;
	private String funcaoProduto;
	private String estoqueProduto;

	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String nomeCliente() {
		return nomeCliente;
	}
	
	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getendereçoCliente() {
		return endereçoCliente;
	}
	
	public void setendereçoCliente(String endereçoCliente) {
		this.endereçoCliente = endereçoCliente;
	}
	
	public int getCPF(){
		return CPF;
	}
	
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	
	public String getemailCliente(){
		return emailCliente;
	}
	
	public void setemailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	public int gettelefoneCliente(){
		return telefoneCliente;
	}
	
	public void setestadoCivil(int telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
}