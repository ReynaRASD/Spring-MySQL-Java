package com.generetion.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generetion.demo.models.SalonModel;
import com.generetion.demo.services.SalonService;

@RestController
//anotacion que convierte en controlador, procesa las peticiones de http
public class SchoolController {
	private final SalonService salonService; 
	
	
	public SchoolController(@Autowired SalonService salonService) {
		this.salonService = salonService;
	}
	
	//mostrar datos del salon
	@GetMapping("/salon")
	public ArrayList<SalonModel> obtenerDatos(){
		return salonService.obtenerDatos();
	}
	
	//guardar y editar Datos en la tabla salon
		@PostMapping("/salon")
		public SalonModel guardarDatos(@RequestBody SalonModel salonModel) {
			return salonService.guardarDatos(salonModel);
		}
		
		
	//eliminar Dato
		@DeleteMapping(path = "/{id}") // localhost:8080/salon/1
		public boolean eliminarDatos(@PathVariable("id")Integer id) {
			return salonService.eliminarDatos(id);
		}
	
}
