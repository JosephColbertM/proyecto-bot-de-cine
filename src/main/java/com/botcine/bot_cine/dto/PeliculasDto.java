package com.botcine.bot_cine.dto;

public class PeliculasDto {
    private Integer peliculasId;
    private String name;
    private String image;
    private String language;
    private String adaptation;
    private String gender;
    private String duration;
    private String definition;
    private String city;
    private String cinema;
    private Integer horarioId;
    private String schedule;
    private Integer asientosId;
    private String seats;
    private String status;
    private Integer datosPagoId;
    private String payment;
    private Integer card;
    private Integer lastDigist;
    private String expirationDate;
    private String client;
    private Integer nit;
    private String date;


    public PeliculasDto(Integer peliculasId, String name, String image, String language, String adaptation, String gender, String duration, String definition, String city, String cinema, Integer horarioId, String schedule, Integer asientosId, String seats, String status, Integer datosPagoId, String payment, Integer card, Integer lastDigist, String expirationDate, String client, Integer nit, String date) {
        this.peliculasId = peliculasId;
        this.name = name;
        this.image = image;
        this.language = language;
        this.adaptation = adaptation;
        this.gender = gender;
        this.duration = duration;
        this.definition = definition;
        this.city = city;
        this.cinema = cinema;
        this.horarioId = horarioId;
        this.schedule = schedule;
        this.asientosId = asientosId;
        this.seats = seats;
        this.status = status;
        this.datosPagoId = datosPagoId;
        this.payment = payment;
        this.card = card;
        this.lastDigist = lastDigist;
        this.expirationDate = expirationDate;
        this.client = client;
        this.nit = nit;
        this.date = date;
    }

    public Integer getPeliculasId() {
        return peliculasId;
    }

    public void setPeliculasId(Integer peliculasId) {
        this.peliculasId = peliculasId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(String adaptation) {
        this.adaptation = adaptation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
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

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PeliculasDto{" +
                "peliculasId=" + peliculasId +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", language='" + language + '\'' +
                ", adaptation='" + adaptation + '\'' +
                ", gender='" + gender + '\'' +
                ", duration='" + duration + '\'' +
                ", definition='" + definition + '\'' +
                ", city='" + city + '\'' +
                ", cinema='" + cinema + '\'' +
                ", horarioId=" + horarioId +
                ", schedule='" + schedule + '\'' +
                ", asientosId=" + asientosId +
                ", seats='" + seats + '\'' +
                ", status='" + status + '\'' +
                ", datosPagoId=" + datosPagoId +
                ", payment='" + payment + '\'' +
                ", card=" + card +
                ", lastDigist=" + lastDigist +
                ", expirationDate='" + expirationDate + '\'' +
                ", client='" + client + '\'' +
                ", nit=" + nit +
                ", date='" + date + '\'' +
                '}';
    }
}
