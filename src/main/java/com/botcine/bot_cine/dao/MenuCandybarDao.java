package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.MenuCandybarDto;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.apache.ibatis.annotations.Select;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

@Service
public interface MenuCandybarDao {
    @Select("SELECT a.nombre, a.precio FROM Paquetes a")
    public List<MenuCandybarDto> findAllCandy();


}
