package com.isabela.cad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isabela.cad.entities.Servicos;
import com.isabela.cad.repositories.ServiçosRepository;

@Service
public class ServicosService {
	
	private final ServiçosRepository ServiçosRepository;
	
	@Autowired
	public ServicosService(ServiçosRepository servicosrepository) {
		this.ServiçosRepository = servicosrepository;
	}
	
	//Criação do produto
	public Servicos saveServicos(Servicos servicos) {
		return ServiçosRepository.save(servicos);
	}
	
	//Buscar produto
	public Servicos getServicosByeId(Long id) {
		return ServiçosRepository.findById(id).orElse(null);
	}
	
	
	//Procurar todos os produtos
	public List<Servicos> getAllServicos(){
		return ServiçosRepository.findAll();
	}
	
	//Excluir os produtos
	public void deleteServicos(Long id) {
		ServiçosRepository.deleteById(id);
		
	}
}