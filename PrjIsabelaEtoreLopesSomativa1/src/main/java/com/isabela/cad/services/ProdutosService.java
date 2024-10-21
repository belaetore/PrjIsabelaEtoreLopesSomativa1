package com.isabela.cad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isabela.cad.entities.Produtos;
import com.isabela.cad.repositories.ProdutosRepository;

@Service
public class ProdutosService {
	
	private final ProdutosRepository ProdutosRepository;
	
	@Autowired
	public ProdutosService(ProdutosRepository produtosrepository) {
		this.ProdutosRepository = produtosrepository;
	}
	
	//Criação do produto
	public Produtos saveProdutos(Produtos produtos) {
		return ProdutosRepository.save(produtos);
	}
	
	//Buscar produto
	public Produtos getPorodutosByeId(Long id) {
		return ProdutosRepository.findById(id).orElse(null);
	}
	
	
	//Procurar todos os produtos
	public List<Produtos> getAllProdutos(){
		return ProdutosRepository.findAll();
	}
	
	//Excluir os produtos
	public void deleteProdutos(Long id) {
		ProdutosRepository.deleteById(id);
		
	}
}
