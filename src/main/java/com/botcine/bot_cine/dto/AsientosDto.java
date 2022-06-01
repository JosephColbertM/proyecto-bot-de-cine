package com.botcine.bot_cine.dto;

public class AsientosDto {
    private Integer asientosId;
    private String seats;
    private String status;

    public AsientosDto(Integer asientosId, String seats, String status) {
        this.asientosId = asientosId;
        this.seats = seats;
        this.status = status;
    }

    public Integer getAsientosId() {
        return asientosId;
    }

    public void setAsientosId(Integer asientosId) {
        this.asientosId = asientosId;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AsientosDto{" +
                "asientosId=" + asientosId +
                ", seats='" + seats + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
