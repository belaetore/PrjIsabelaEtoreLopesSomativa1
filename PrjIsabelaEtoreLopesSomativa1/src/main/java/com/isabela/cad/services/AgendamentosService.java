package com.isabela.cad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isabela.cad.entities.Agendamentos;
import com.isabela.cad.repositories.AgendamentosRepository;

@Service
public class AgendamentosService {
	
	private final AgendamentosRepository AgendamentosRepository;
	
	@Autowired
	public AgendamentosService(AgendamentosRepository agendamentosrepository) {
		this.AgendamentosRepository = agendamentosrepository;
	}
	
	//Criação do produto
	public Agendamentos saveAgendamentos(Agendamentos agendamentos) {
		return AgendamentosRepository.save(agendamentos);
	}
	
	//Buscar produto
	public Agendamentos getAgendamentosByeId(Long id) {
		return AgendamentosRepository.findById(id).orElse(null);
	}
	
	
	//Procurar todos os produtos
	public List<Agendamentos> getAllAgendamentos(){
		return AgendamentosRepository.findAll();
	}
	
	//Excluir os produtos
	public void deleteAgendamentos(Long id) {
		AgendamentosRepository.deleteById(id);
		
	}
}
