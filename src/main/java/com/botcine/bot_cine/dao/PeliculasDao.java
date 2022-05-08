package com.botcine.bot_cine.dao;

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

}


