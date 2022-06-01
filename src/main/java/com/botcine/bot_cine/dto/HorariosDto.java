package com.botcine.bot_cine.dto;

public class HorariosDto {
    private Integer horarioId;
    private String schedule;

    public HorariosDto(Integer horarioId, String schedule) {
        this.horarioId = horarioId;
        this.schedule = schedule;
    }

    public Integer getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Integer horarioId) {
        this.horarioId = horarioId;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "HorariosDto{" +
                "horarioId=" + horarioId +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}
