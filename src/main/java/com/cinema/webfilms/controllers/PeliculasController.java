package com.cinema.webfilms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cinema.webfilms.entities.PeliculasEntities;
import com.cinema.webfilms.services.IPeliculasService;


//SE GENERA CONTROLLER
@Controller
public class PeliculasController {

//AUTOWIRED INYECTA DEPENDENCIAS DE SERVICE
	@Autowired
	private IPeliculasService PeliculasService;

//HREF EN HTML
	@RequestMapping(value = "/crearPeliculas")
	// MODELANDVIEW LOS DATOS INTRODUCIDOS SE MUESTRAN EN PANTALLA
	public ModelAndView crearNuevaPelicula(
//REQUESTPATAM DATOS QUE SE VERÁN EN PANTALLA E INTERACTUARÁN CON MODELANDVIEW
//REQUIRED=FALSE 
			
			@RequestParam(required = false) String titulo, 
			@RequestParam(required = false) String sinopsis,
			@RequestParam(required = false) Integer anio_estreno, 
			@RequestParam(required = false) String imagen,
			@RequestParam(required = false) String video) {
		
//CREAS PRODUCTO
		if(titulo != null) {
			PeliculasEntities a = new PeliculasEntities(0, titulo, sinopsis, anio_estreno, imagen, video);
//
			PeliculasService.addPeliculas(a);
			return new ModelAndView("redirect:/crearPeliculas");
		}
		List<PeliculasEntities> peliculas = PeliculasService.findAll();
		ModelAndView mav = new ModelAndView();

//MAV.SETVIEWNAME nombre del html
//MAV.ADDOBJECT
		mav.setViewName("crear_pelicula");
		mav.addObject("peliculas", peliculas);
		return mav;

	}
}
