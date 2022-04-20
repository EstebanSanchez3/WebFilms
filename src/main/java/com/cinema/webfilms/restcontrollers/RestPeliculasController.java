package com.cinema.webfilms.restcontrollers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.webfilms.entities.PeliculasEntities;
import com.cinema.webfilms.services.IPeliculasService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestPeliculasController {
	@Autowired
	IPeliculasService peliculasService;
	
	@GetMapping(path="/peliculas", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<PeliculasEntities> getpeliculas(){
		return peliculasService.findAll();
	}
}
