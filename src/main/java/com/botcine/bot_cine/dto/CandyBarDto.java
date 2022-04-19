package com.botcine.bot_cine.dto;

public class CandyBarDto {
    String Nombre;
    String Categoria;
    String Precio;

    public CandyBarDto(String nombre, String categoria, String precio) {
        Nombre = nombre;
        Categoria = categoria;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre = " + Nombre + '\n' +
                "Categoria = " + Categoria + '\n' +
                "Precio = " + Precio+ '\n';
    }
}
