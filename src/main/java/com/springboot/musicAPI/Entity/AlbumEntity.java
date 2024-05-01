package com.springboot.musicAPI.Entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="albums")
public class AlbumEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private Date lanzado;
    private String genero;
    private Double precio;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Date getLanzado() {
        return lanzado;
    }
    public void setLanzado(Date lanzado) {
        this.lanzado = lanzado;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "AlbumEntity [id=" + id + ", titulo=" + titulo + ", lanzado=" + lanzado + ", genero=" + genero
                + ", precio=" + precio + "]";
    }

    
    
    
}
