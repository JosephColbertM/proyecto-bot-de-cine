package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.AdministradorDto;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdministradorDao {
    @Select("SELECT ca,nombre, apellido, usuario, password,bot_chat_id FROM administrador where status = 1")
    public List<AdministradorDto> findAllAdministradores();

    @Insert("INSERT INTO administrador(nombre, apellido, usuario, password, bot_chat_id)" +
            " VALUES (#{nombre}, #{apellido}, #{usuario}, #{password}, #{bot_chat_id})")

    void saveAdministrador(@Param("nombre") String nombre, @Param("apellido") String apellido, @Param("usuario") String usuario, @Param("password") String password, @Param("bot_chat_id") String bot_chat_id);

    @Update("UPDATE administrador " +
            "SET nombre      = #{nombre}," +
            "    apellido    = #{apellido}," +
            "    usuario     = #{usuario}," +
            "    password    = #{password}," +
            "    bot_chat_id = #{bot_chat_id}" +
            "WHERE ca = #{idAdministrator};")

    void updateAdministrator(@Param ("idAdministrator")Integer idAdministrator, @Param("nombre") String nombre, @Param("apellido") String apellido, @Param("usuario") String usuario, @Param("password") String password, @Param("bot_chat_id") String bot_chat_id);

    @Delete("DELETE " +
            "FROM administrador " +
            "WHERE ca = #{idAdministrator};")
    void deleteAdministrator(@Param ("idAdministrator") Integer idAdministrator);

    @Update("UPDATE administrador " +
            "SET status = 0 " +
            "WHERE ca = #{idAdministrator};")
    void deleteAdministrator2(Integer idAdministrator);

    @Select("SELECT ca,nombre, apellido, usuario, password,bot_chat_id FROM administrador where status = 1 and ca = #{idAdministrador};")
    AdministradorDto findById(Integer idAdministrador);
}
