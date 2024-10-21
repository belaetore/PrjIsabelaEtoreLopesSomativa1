package com.isabela.cad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isabela.cad.entities.Clientes;
import com.isabela.cad.repositories.ClientesRepository;

@Service
public class ClientesService {
	
	private final ClientesRepository ClientesRepository;
	
	@Autowired
	public ClientesService(ClientesRepository clientesrepository) {
		this.ClientesRepository = clientesrepository;
	}
	
	//Criação do produto
	public Clientes saveClientes(Clientes clientes) {
		return ClientesRepository.save(clientes);
	}
	
	//Buscar produto
	public Clientes getClientesByeId(Long id) {
		return ClientesRepository.findById(id).orElse(null);
	}
	
	
	//Procurar todos os produtos
	public List<Clientes> getAllClientes(){
		return ClientesRepository.findAll();
	}
	
	//Excluir os produtos
	public void deleteClientes(Long id) {
		ClientesRepository.deleteById(id);
		
	}
}
