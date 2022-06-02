package com.botcine.bot_cine.dto;

public class DatosPagosProductoDto {
    private Integer datosPagoId;
    private String payment;
    private String card;
    private Integer lastDigist;
    private String expirationDate;
    private String name;
    private Integer nit;

    public DatosPagosProductoDto(Integer datosPagoId, String payment, String card, Integer lastDigist, String expirationDate, String name, Integer nit) {
        this.datosPagoId = datosPagoId;
        this.payment = payment;
        this.card = card;
        this.lastDigist = lastDigist;
        this.expirationDate = expirationDate;
        this.name = name;
        this.nit = nit;
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

    @Override
    public String toString() {
        return "datosPagoDto{" +
                "datosPagoId=" + datosPagoId +
                ", payment='" + payment + '\'' +
                ", card='" + card + '\'' +
                ", lastDigist=" + lastDigist +
                ", expirationDate='" + expirationDate + '\'' +
                ", name='" + name + '\'' +
                ", nit=" + nit +
                '}';
    }
}
