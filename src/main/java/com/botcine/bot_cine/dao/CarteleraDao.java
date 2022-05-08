package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.CarteleraDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarteleraDao {

    @Select("SELECT a.cp, a.nombre, a.duracion, a.genero, a.horario " +
            "FROM peliculas a ")
    public List<CarteleraDto> findAllPeliculas();


    @Insert("INSERT INTO peliculas(nombre, duracion, genero)" +
            " VALUES (#{nombre}, #{duracion}, #{genero})")

    void saveCartelera(@Param("cantidad") Integer cantidad, @Param("nombre_pelicula") String nombre_pelicula, @Param("horario") String horario);

}

