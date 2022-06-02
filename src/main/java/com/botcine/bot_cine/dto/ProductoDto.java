package com.botcine.bot_cine.dto;

public class ProductoDto {
    private String nombre;
    private String sabor;
    private String image;
    private Double precio;
    private String fecha;
    private Integer cantidad;
    private Double precio_final;
    private Integer Producto_productoId;

    public ProductoDto(String nombre, String sabor, String image, Double precio) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.image = image;
        this.precio = precio;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public Integer getProducto_productoId() {
        return Producto_productoId;
    }

    public void setProducto_productoId(Integer producto_productoId) {
        Producto_productoId = producto_productoId;
    }

    @Override
    public String toString() {
        return "ProductoDto{" +
                "nombre='" + nombre + '\'' +
                ", sabor='" + sabor + '\'' +
                ", image='" + image + '\'' +
                ", precio=" + precio +
                ", fecha='" + fecha + '\'' +
                ", cantidad=" + cantidad +
                ", precio_final=" + precio_final +
                ", Producto_productoId=" + Producto_productoId +
                '}';
    }
}
