package com.botcine.bot_cine.dto;

public class ProductoDto {
    String Nombre;
    String Sabor;
    Double Precio;

    public ProductoDto(String nombre, String sabor, Double precio) {
        Nombre = nombre;
        Sabor = sabor;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoDto{" +
                "Nombre='" + Nombre + '\'' +
                ", Sabor='" + Sabor + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
