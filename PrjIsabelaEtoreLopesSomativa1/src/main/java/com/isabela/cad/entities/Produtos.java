package com.isabela.cad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
	
	public String nomeProduto() {
		return nomeProduto;
	}
	
	public void setnomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String gettipoProduto() {
		return tipoProduto;
	}
	
	public void settipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	public String getfuncaoProduto(){
		return funcaoProduto;
	}
	
	public void setfuncaoProduto(String funcaoProduto) {
		this.funcaoProduto = funcaoProduto;
	}
	
	public String getestoqueProduto(){
		return estoqueProduto;
	}
	
	public void setestoqueProduto(String estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}
	
}