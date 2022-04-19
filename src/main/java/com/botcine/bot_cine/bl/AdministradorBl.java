package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dto.AdministradorDto;


import java.util.ArrayList;
import java.util.List;

public class AdministradorBl {
    public AdministradorBl() {
    }
    public List<AdministradorDto> findLast10PermissionsByChatId(Long chatId) {
        List<AdministradorDto> result = new ArrayList<>();
        result.add(new AdministradorDto("Francisco", "Valdez", "Fran52","12345"));
        result.add(new AdministradorDto("Pedro", "Pascal", "Pascal1","password"));

        return result;
    }
}
