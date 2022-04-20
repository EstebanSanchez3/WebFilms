package com.cinema.webfilms.services;

import java.util.List;
import com.cinema.webfilms.entities.PeliculasEntities;

public interface IPeliculasService {

	public void addPeliculas(PeliculasEntities a);
	public List<PeliculasEntities> findAll();

}
