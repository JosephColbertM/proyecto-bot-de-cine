package com.botcine.bot_cine.dto;

public class CandyBarDto {
    Integer ccp;
    String nombre;
    Double precio;

    public CandyBarDto(Integer ccp, String nombre, Double precio) {
        this.ccp = ccp;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getCcp() {
        return ccp;
    }

    public void setCcp(Integer ccp) {
        this.ccp = ccp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CandyBarDto{" +
                "ccp=" + ccp +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
