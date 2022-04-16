package com.botcine.bot_cine.dto;

public class PeliculasDto {
    private String nombre;
    private String duracion;
    private String genero;
    private String horario;

    public PeliculasDto(String nombre, String duracion, String genero, String horario) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.horario = horario;
    }

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
        return
                "Película: " + nombre + '\n' +
                "Duración: " + duracion + '\n' +
                "Genero: " + genero + '\n' +
                "Funciones: " + horario + '\n';
    }
}
