package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.PeliculasDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeliculasDao {

    @Select("SELECT peliculasId, name, image, language, adaptation, gender, duration, definition" +
            "FROM peliculas")
    public List<PeliculasDto> findAllPeliculas();

    @Select("SELECT peliculasId, name"+
            "FROM peliculas")
    PeliculasDto showPeliculas(String nombre);

    @Select("SELECT a.peliculasId, a.name, a.image, a.city, a.cinema, b.schedule" +
            "FROM peliculas a, horarios b WHERE a.peliculas = b.peliculas ")
    PeliculasDto showHorario(Integer peliculasId);

    @Select("SELECT a.peliculasId, b.horariosId, c.seats"+
            "FROM peliculas a, horarios b, asientos c" +
            "WHERE c.state = true")
    PeliculasDto showAsientos(Integer peliculasId, Integer horarioId);

    @Insert("INSERT INTO compraTicket(peliculasId, horarioId, date, seats)" +
            " VALUES (#{peliculasId}, #{horarioId}, #{date}, #{seats} )")
    void saveTicket(@Param("peliculasId") Integer peliculasId, @Param("horarioId") Integer horarioId, @Param("date") String date, @Param("seats") String seast);

    @Select("SELECT datosPagoId, peliculasId")
    PeliculasDto showdatosPago(Integer datosPagoId);

    @Insert("INSERT INTO datos_pago(datospagoId, payment, card, lastdigist, expirationdate, name, nit)" +
            " VALUES (#{datospagoId}, #{payment}, #{payment}, #{card}, #{lastdigist}, #{expirationdate}, #{name}, #{nit})")
    void addDatosPago(@Param ("datospagoId") Integer datosPagoId, @Param("payment") String payment, @Param("card") String card, @Param("lastdigist") Integer lastDigist, @Param("expirationdate") String expirationDate, @Param("name") String name, @Param("nit") Integer nit);


}

