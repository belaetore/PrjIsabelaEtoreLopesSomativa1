package com.isabela.cad.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agendamentos")
public class Agendamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dataAgendamento;
	private int horarioAgendamento;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String dataAgendamento() {
		return dataAgendamento;
	}
	
	public void setdataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
	public int horarioAgendamento() {
		return horarioAgendamento;
	}
	
	public void sethorarioAgendamento(int horarioAgendamento) {
		this.horarioAgendamento = horarioAgendamento;
	}
}