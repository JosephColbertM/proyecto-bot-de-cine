package com.botcine.bot_cine.dao;

import com.botcine.bot_cine.dto.AdministradorDto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandyBarDao {

    @Select("SELECT nombre, categoria, precio FROM compra_paquetes")
    public List<AdministradorDto> findAllCandyBar();
}
