package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dao.AdministradorDao;
import com.botcine.bot_cine.dto.AdministradorDto;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;

@Service
public class AdministradorBl {
    private AdministradorDao administradorDao;

    @Autowired
    public AdministradorBl(AdministradorDao administradorDao) {
        this.administradorDao = administradorDao;
    }

    public List<AdministradorDto> findLast10PermissionsByChatId(Long chatId) {
        return administradorDao.findAllAdministradores();
    }
}
