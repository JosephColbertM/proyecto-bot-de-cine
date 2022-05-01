package com.botcine.bot_cine.dto;



public class PeliculasDto{
    private Integer cp;
    private String nombre;
    private String duracion;
    private String genero;
    private String horario;

    public PeliculasDto(Integer cp, String nombre, String duracion, String genero, String horario) {
        this.cp = cp;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.horario = horario;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "PeliculasDto{" +
                "cp=" + cp +
                ", nombre='" + nombre + '\'' +
                ", duracion='" + duracion + '\'' +
                ", genero='" + genero + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
