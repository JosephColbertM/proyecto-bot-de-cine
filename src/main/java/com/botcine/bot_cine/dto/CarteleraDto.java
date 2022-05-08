package com.botcine.bot_cine.dto;

public class CarteleraDto {
    private Integer cpt;
    private String fecha;
    private Double precio_final;
    private Integer cantidad;
    private String nombre_pelicula;
    private String horario;

    public CarteleraDto(Integer cpt, String fecha, Double precio_final, Integer cantidad, String nombre_pelicula, String horario) {
        this.cpt = cpt;
        this.fecha = fecha;
        this.precio_final = precio_final;
        this.cantidad = cantidad;
        this.nombre_pelicula = nombre_pelicula;
        this.horario = horario;
    }

    public Integer getCpt() {
        return cpt;
    }

    public void setCpt(Integer cpt) {
        this.cpt = cpt;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(Double precio_final) {
        this.precio_final = precio_final;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "CarteleraDto{" +
                "cpt=" + cpt +
                ", fecha='" + fecha + '\'' +
                ", precio_final=" + precio_final +
                ", cantidad=" + cantidad +
                ", nombre_pelicula='" + nombre_pelicula + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
