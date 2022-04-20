package com.cinema.webfilms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cinema.webfilms.entities.PeliculasEntities;

//EXTENDS EN FORMA (JPA) EL REPOSITORIO
//JPA AYUDA AL PROYECTO EN CASI TODX
//INTEGER INDICA NUMEROS ENTEROS DENTRO DE LOS VALORES
public interface IPeliculasRepository extends JpaRepository <PeliculasEntities, Integer> {

}
