package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dto.CandyBarDto;
import java.util.ArrayList;
import java.util.List;

public class CandyBarBl {
    public CandyBarBl() {
    }
    public List<CandyBarDto> findLast10PermissionsByChatId(Long chatId) {
        List<CandyBarDto> result = new ArrayList<>();
       // result.add(new CandyBarDto("PopCorns","Comida","10.50 Bs"));
       // result.add(new CandyBarDto("Chocolate","Dulces","5.50 Bs"));
       // result.add(new CandyBarDto("Coca Cola","Refresco","8.50 Bs"));

        return result;
    }
}
