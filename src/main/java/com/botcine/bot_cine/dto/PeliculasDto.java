package com.botcine.bot_cine.dto;

public class PeliculasDto{
    private Integer cp;
    private String nombre;
    private String duracion;
    private String horario_inicio;
    private String horario_final;

    public PeliculasDto(Integer cp, String nombre, String duracion, String horario_inicio, String horario_final) {
        this.cp = cp;
        this.nombre = nombre;
        this.duracion = duracion;
        this.horario_inicio = horario_inicio;
        this.horario_final = horario_final;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
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

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(String horario_final) {
        this.horario_final = horario_final;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + '\n' +
                        "Duración: " + duracion + '\n' +
                        "Hora de Inicio: " + horario_inicio + '\n' +
                        "Hora de Salida: " + horario_final + '\n' ;
    }
}
