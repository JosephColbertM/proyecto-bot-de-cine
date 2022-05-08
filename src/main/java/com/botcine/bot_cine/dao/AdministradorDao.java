package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.AdministradorDto;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdministradorDao {
    @Select("SELECT ca,nombre, apellido, usuario, password,bot_chat_id FROM administrador")
    public List<AdministradorDto> findAllAdministradores();

    @Insert("INSERT INTO administrador(nombre, apellido, usuario, password, bot_chat_id)" +
            " VALUES (#{nombre}, #{apellido}, #{usuario}, #{password}, #{bot_chat_id})")

    void saveAdministrador(@Param("nombre") String nombre, @Param("apellido") String apellido, @Param("usuario") String usuario, @Param("password") String password, @Param("bot_chat_id") String bot_chat_id);

}
