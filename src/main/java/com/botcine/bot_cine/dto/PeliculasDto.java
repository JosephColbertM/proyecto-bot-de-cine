package com.botcine.bot_cine.dto;



public class PeliculasDto{
    private Integer cp;
    private String nombre;
    private String duracion;
    private String genero;

    public PeliculasDto(Integer cp, String nombre, String duracion, String genero) {
        this.cp = cp;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    public PeliculasDto(){
        nombre = " ";
        duracion = " ";
        genero = " ";
    }

    public Integer getCp() { return cp; }

    public void setCp(Integer cp) {this.cp = cp; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "PeliculasDto{" +
                "cp=" + cp +
                ", nombre='" + nombre + '\'' +
                ", duracion='" + duracion + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
