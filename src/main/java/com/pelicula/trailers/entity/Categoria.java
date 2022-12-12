
package com.pelicula.trailers.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Diego
 */
@Entity
public class Categoria {
   @Id
   private Integer id_genero;
   
   private String titulo;
    //Constructor

    public Categoria() {
    }

    public Categoria(Integer id_genero, String titulo) {
        this.id_genero = id_genero;
        this.titulo = titulo;
    }

    public Categoria(Integer id_genero) {
        this.id_genero = id_genero;
    }

    public Categoria(String titulo) {
        this.titulo = titulo;
    }
   
   //Getter and Setter

    public Integer getId_genero() {
        return id_genero;
    }

    public void setId_genero(Integer id_genero) {
        this.id_genero = id_genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
}
