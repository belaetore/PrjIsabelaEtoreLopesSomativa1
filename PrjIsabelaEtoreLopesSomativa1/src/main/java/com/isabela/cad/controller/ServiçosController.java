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

import com.isabela.cad.entities.Servicos;
import com.isabela.cad.services.ServicosService;

@RestController
@RequestMapping("/servicos")
public class ServiçosController {
	
	private final ServicosService servicosservice;
	
	@Autowired
	public ServiçosController(ServicosService servicosservice) {
		this.servicosservice = servicosservice;
	}
	
	@PostMapping
	public Servicos createServicos(@RequestBody Servicos servicos) {
		return servicosservice.saveServicos(servicos);
	}
	
	@GetMapping
	public List<Servicos> getAllServicos(){
		return servicosservice.getAllServicos();
	}
	
	@GetMapping("/id")
	public Servicos getServicos(@PathVariable Long id) {
		return servicosservice.getServicosByeId(id);
	}
	
	@DeleteMapping("/id")
	public void deleteServicos(@PathVariable Long id) {
		servicosservice.deleteServicos(id);
	}
}