package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.AdministradorDto;
import com.botcine.bot_cine.dto.CandyBarDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandyBarDao {

    @Select("SELECT a.cp, a.nombre, a.duracion, a.genero " +
            "FROM peliculas a JOIN horarios b ON a.cp = b.ch WHERE a.cp = #{cp}")

    public List<CandyBarDto> findAllCandyBar(@Param("cp") Integer id);


}
