package com.botcine.bot_cine.dto;

public class DatosPagosProductoDto {
    private Integer datosPagoId;
    private String payment;
    private String card;
    private Integer lastDigist;
    private String expirationDate;
    private String name;
    private Integer nit;
    private Integer Compra_producto_compraProductoId;

    public DatosPagosProductoDto(Integer datosPagoId, String payment, String card, Integer lastDigist, String expirationDate, String name, Integer nit, Integer compra_producto_compraProductoId) {
        this.datosPagoId = datosPagoId;
        this.payment = payment;
        this.card = card;
        this.lastDigist = lastDigist;
        this.expirationDate = expirationDate;
        this.name = name;
        this.nit = nit;
        Compra_producto_compraProductoId = compra_producto_compraProductoId;
    }

    public Integer getDatosPagoId() {
        return datosPagoId;
    }

    public void setDatosPagoId(Integer datosPagoId) {
        this.datosPagoId = datosPagoId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Integer getLastDigist() {
        return lastDigist;
    }

    public void setLastDigist(Integer lastDigist) {
        this.lastDigist = lastDigist;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public Integer getCompra_producto_compraProductoId() {
        return Compra_producto_compraProductoId;
    }

    public void setCompra_producto_compraProductoId(Integer compra_producto_compraProductoId) {
        Compra_producto_compraProductoId = compra_producto_compraProductoId;
    }

    @Override
    public String toString() {
        return "DatosPagosProductoDto{" +
                "datosPagoId=" + datosPagoId +
                ", payment='" + payment + '\'' +
                ", card='" + card + '\'' +
                ", lastDigist=" + lastDigist +
                ", expirationDate='" + expirationDate + '\'' +
                ", name='" + name + '\'' +
                ", nit=" + nit +
                ", Compra_producto_compraProductoId=" + Compra_producto_compraProductoId +
                '}';
    }
}
