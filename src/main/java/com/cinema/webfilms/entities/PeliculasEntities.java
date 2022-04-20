package com.cinema.webfilms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//GENERAR ENTITY
       @Entity(name = "peliculas")
       public class PeliculasEntities {
	
//GENERAR ID+GENERATEDVALUE PARA PK Y AUTOINCREMENTAL
//CREAR VALORES
	  @Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
	  private  int identificador ;
	  private String titulo ;
	  private String sinopsis ;
	  private int anio_estreno ;
	  private String imagen ;
	  private String video ;

//GETTERS AND SETTERS
	  public int getIdentificador() {
			return identificador;
		}
		public void setIdentificador(int identificador) {
			this.identificador = identificador;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getSinopsis() {
			return sinopsis;
		}
		public void setSinopsis(String sinopsis) {
			this.sinopsis = sinopsis;
		}
		public int getAnio_estreno() {
			return anio_estreno;
		}
		public void setAnio_estreno(int anio_estreno) {
			this.anio_estreno = anio_estreno;
		}
		public String getImagen() {
			return imagen;
		}
		public void setImagen(String imagen) {
			this.imagen = imagen;
		}
		public String getVideo() {
			return video;
		}
		public void setVideo(String video) {
			this.video = video;
		}

		
//CONSTRUCTOR VACÍO
		public PeliculasEntities() {
		}

					
//CONSTRUCTOR CON TODOS
		public PeliculasEntities(int identificador, String titulo, String sinopsis, int anio_estreno, String imagen,
				String video) {
			this.identificador = identificador;
			this.titulo = titulo;
			this.sinopsis = sinopsis;
			this.anio_estreno = anio_estreno;
			this.imagen = imagen;
			this.video = video;
		}
		
}
