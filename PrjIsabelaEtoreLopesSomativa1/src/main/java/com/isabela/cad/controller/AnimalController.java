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

import com.isabela.cad.entities.Animal;
import com.isabela.cad.services.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	
	private final AnimalService animalservice;
	
	@Autowired
	public AnimalController(AnimalService animalservice) {
		this.animalservice = animalservice;
	}
	
	@PostMapping
	public Animal createAnimal(@RequestBody Animal animal) {
		return animalservice.saveAnimal(animal);
	}
	
	@GetMapping
	public List<Animal> getAllAnimal(){
		return animalservice.getAllAnimal();
	}
	
	@GetMapping("/id")
	public Animal getAnimal(@PathVariable Long id) {
		return animalservice.getAnimalByeId(id);
	}
	
	@DeleteMapping("/id")
	public void deleteAnimal(@PathVariable Long id) {
		animalservice.deleteAnimal(id);
	}
}