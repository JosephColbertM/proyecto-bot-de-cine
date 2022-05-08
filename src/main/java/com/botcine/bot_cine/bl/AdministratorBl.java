package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dao.AdministradorDao;
import com.botcine.bot_cine.dao.PeliculasDao;
import com.botcine.bot_cine.dto.AdministradorDto;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorBl {

    private AdministradorDao administradorDao;

    public AdministratorBl(AdministradorDao administradorDao) {
        this.administradorDao = administradorDao;
    }

    public List<AdministradorDto> listAdmins(Long chatId){
        return administradorDao.findAllAdministradores();
    }


}
