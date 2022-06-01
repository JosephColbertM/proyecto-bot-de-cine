package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.DatosPagoDto;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeliculasDao {

    @Select("SELECT cp, nombre, duracion, horario_inicio, horario_final " +
            "FROM peliculas")
    public List<PeliculasDto> findAllPeliculas();


    @Insert("INSERT INTO peliculas(nombre, duracion, horario_inicio, horario_final)" +
            " VALUES (#{nombre}, #{duracion}, #{horario_inicio}, #{horario_final} )")

    void savePeliculas(@Param("nombre") String nombre, @Param("duracion") String duracion, @Param("horario_inicio") String hora_inicio, @Param("horario_final") String hora_final);

    @Select()
    PeliculasDto showPeliculas(String nombre);

    @Select()
    PeliculasDto showHorario(Integer peliculasId);

    @Select()
    PeliculasDto showAsientos(Integer peliculasId, Integer horarioId);

    void saveTicket(@Param("nombre") String nombre, @Param("apellido") String apellido, @Param("usuario") String usuario, @Param("password") String password, @Param("bot_chat_id") String bot_chat_id);

    @Select()
    DatosPagoDto showdatosPago(Integer datosPagoId);

    void addDatosPago(Integer datosPagoId, String payment, String card, String lastDigist, String expirationDate, String name, Integer nit);


}


