package com.generetion.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generetion.demo.models.SalonModel;

@Repository
public interface SalonRepository extends JpaRepository<SalonModel, Integer>{
	//metodos jpa
	//agregas un modelo, y agrega el tipo de valor que estamos utilizando como identificador
	
}
