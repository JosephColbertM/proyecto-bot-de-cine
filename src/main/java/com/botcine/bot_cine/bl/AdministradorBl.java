package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dto.AdministradorDto;


import java.util.ArrayList;
import java.util.List;

public class AdministradorBl {
    public AdministradorBl() {
    }
    public List<AdministradorDto> findLast10PermissionsByChatId(Long chatId) {
        List<AdministradorDto> result = new ArrayList<>();
        result.add(new AdministradorDto("Gustavo", "Lopez", "Gustavo55","12345"));
        result.add(new AdministradorDto("Pepe", "Mariaca", "Pepe8888","password"));

        return result;
    }
}
