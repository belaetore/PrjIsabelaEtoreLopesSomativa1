package com.isabela.cad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isabela.cad.entities.Produtos;
import com.isabela.cad.services.ProdutosService;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
	
	private final ProdutosService produtosservice;
	
	@Autowired
	public ProdutosController(ProdutosService produtosservice) {
		this.produtosservice = produtosservice;
	}
	
	@PostMapping
	public Produtos createProdutos(@RequestBody Produtos produtos) {
		return produtosservice.saveProdutos(produtos);
	}
	
	@GetMapping
	public List<Produtos> getAllClientes(){
		return produtosservice.getAllProdutos();
	}
	
	@GetMapping("/id")
	public Produtos getProdutos(@PathVariable Long id) {
		return produtosservice.getProdutoByeId(id);
	}
	
	@DeleteMapping("/id")
	public void deleteProdutos(@PathVariable Long id) {
		produtosservice.deleteProdutos(id);
	}
}