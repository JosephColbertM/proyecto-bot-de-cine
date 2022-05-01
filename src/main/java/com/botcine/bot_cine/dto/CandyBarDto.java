package com.botcine.bot_cine.dto;

public class CandyBarDto {
    Integer ccp;
    String nombre;
    String categoria;
    Number precio;
    Integer usuario_cu;
    Integer paquetes_cpr;

    public CandyBarDto(Integer ccp, String nombre, String categoria, Number precio, Integer usuario_cu, Integer paquetes_cpr) {
        this.ccp = ccp;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.usuario_cu = usuario_cu;
        this.paquetes_cpr = paquetes_cpr;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    public Integer getUsuario_cu() {
        return usuario_cu;
    }

    public void setUsuario_cu(Integer usuario_cu) {
        this.usuario_cu = usuario_cu;
    }

    public Integer getPaquetes_cpr() {
        return paquetes_cpr;
    }

    public void setPaquetes_cpr(Integer paquetes_cpr) {
        this.paquetes_cpr = paquetes_cpr;
    }

    @Override
    public String toString() {
        return "CandyBarDto{" +
                "ccp=" + ccp +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", usuario_cu=" + usuario_cu +
                ", paquetes_cpr=" + paquetes_cpr +
                '}';
    }
}
