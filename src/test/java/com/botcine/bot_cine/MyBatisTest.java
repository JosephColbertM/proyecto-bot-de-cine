package com.botcine.bot_cine;

import com.botcine.bot_cine.dao.AdministradorDao;
import com.botcine.bot_cine.dto.AdministradorDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisTest {
    private AdministradorDao administradorDao;

    @Autowired
    public MyBatisTest(AdministradorDao administradorDao) {
        this.administradorDao = administradorDao;
    }

    @Test
    public void testSelectAllAdministradores(){
        List<AdministradorDto> administradorDtoList = administradorDao.findAllAdministradores();
        for (AdministradorDto admi : administradorDtoList){
            System.out.println("Administradores: "+ admi);
        }

}}
