package com.cinema.webfilms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cinema.webfilms.entities.PeliculasEntities;
import com.cinema.webfilms.repositories.IPeliculasRepository;



//GENERAR SERVICE E IMPLEMENTS SOBRE IPRODUCTOSSERVICE
         @Service
         public class PeliculasServiceImpl implements IPeliculasService {
    	 
//AUTOWAIRED INYECTA DEPENDENCIAS A REPOSITORY
//IPORTAR REPOSITORY
        	 @Autowired
        	 IPeliculasRepository repo ;
        	 
//OVERRIDE SOBRESCRIBE UN METODO
//REPO ES ABREBIATURA
             @Override
             public void addPeliculas(PeliculasEntities a) {
           	  repo.save(a) ;
             }
             
//OVERRIDE LIST
             @Override
             public List<PeliculasEntities> findAll() {
           	return repo.findAll() ; 
             }    
       }
//PRIMERAS LINEAS DE OVERRIDE EN IxxxSERVICE
	


