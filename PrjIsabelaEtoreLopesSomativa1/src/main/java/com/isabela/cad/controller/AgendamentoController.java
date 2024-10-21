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

import com.isabela.cad.entities.Agendamentos;
import com.isabela.cad.services.AgendamentosService;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	
	private final AgendamentoController agendamentoservice;
	
	@Autowired
	public AgendamentoController(AgendamentoController agendamentoservice) {
		this.agendamentoservice = agendamentoservice;
	}
	
	@PostMapping
	public Agendamentos createAgendamentos(@RequestBody Agendamentos agendamentos) {
		return agendamentoservice.createAgendamentos(agendamentos);
	}
	
	@GetMapping
	public List<Agendamentos> getAllAgendamentos(){
		return agendamentoservice.getAllAgendamentos();
	}
	
	@GetMapping("/id")
	public Agendamentos getAgendamentos(@PathVariable Long id) {
		return agendamentoservice.getAgendamentos(id);
	}
	
	@DeleteMapping("/id")
	public void deleteAgendamentos(@PathVariable Long id) {
		agendamentoservice.deleteAgendamentos(id);
	}
}
