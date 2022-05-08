package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.PeliculasDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeliculasDao {

    @Select("SELECT a.cp, a.nombre, a.duracion, a.genero " +
            "FROM peliculas a ")
    public List<PeliculasDto> findAllPeliculas();


    @Insert("INSERT INTO peliculas(nombre, duracion, genero)" +
            " VALUES (#{nombre}, #{duracion}, #{genero})")

    void savePeliculas(@Param("nombre") String nombre, @Param("duracion") String duracion, @Param("genero") String genero);

}


