package com.generetion.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.generetion.demo.models.SalonModel;
import com.generetion.demo.repositories.SalonRepository;

@Service
public class SalonService {
	private final SalonRepository salonRepository;
	
	public SalonService(@Autowired SalonRepository salonRepository) {
		this.salonRepository = salonRepository;
		//esto es un tipo de dato
		//es un tipo de objeto salonRepository
		//Es una instancia de esa interfaz
	}
	
	//obtener y mostrar elementos
	public ArrayList<SalonModel> obtenerDatos(){
		//tipo de dato es SalonModel
		return (ArrayList<SalonModel>) salonRepository.findAll();
	}
	
	//guardar Datos
	public SalonModel guardarDatos(SalonModel salonModel) {
		return salonRepository.save(salonModel);
	}
	
	//eliminar Datos
	public boolean eliminarDatos(Integer id) {
		try {
			salonRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	

}
