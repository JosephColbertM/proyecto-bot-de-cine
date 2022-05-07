package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.AdministradorDto;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdministradorDao {
    @Select("SELECT ca, nombre, apellido, usuario, password FROM administrador WHERE ca = #{ca}")
    public List<AdministradorDto> findAllAdministradores(@Param("ca")Integer id);
}
