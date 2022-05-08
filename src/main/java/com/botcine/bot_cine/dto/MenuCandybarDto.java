package com.botcine.bot_cine.dto;

public class MenuCandybarDto {
    String nombre;
    Double precio_u;
    Integer cantidad;
    Double precio_final;

    public MenuCandybarDto(String nombre, Double precio_u, Integer cantidad, Double precio_final) {
        this.nombre = nombre;
        this.precio_u = precio_u;
        this.cantidad = cantidad;
        this.precio_final = precio_final;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio_u() {
        return precio_u;
    }

    public void setPrecio_u(Double precio_u) {
        this.precio_u = precio_u;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(Double precio_final) {
        this.precio_final = precio_final;
    }

    @Override
    public String toString() {
        return "MenuCandybarDto{" +
                "nombre='" + nombre + '\'' +
                ", precio_u=" + precio_u +
                ", cantidad=" + cantidad +
                ", precio_final=" + precio_final +
                '}';
    }
}
