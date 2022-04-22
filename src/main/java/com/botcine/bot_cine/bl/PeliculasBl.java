package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dto.PeliculasDto;

import java.util.ArrayList;
import java.util.List;

public class PeliculasBl {
    public PeliculasBl() {
    }
    public List<PeliculasDto> findLast10PermissionsByChatId(Long chatId) {
        List<PeliculasDto> result = new ArrayList<>();
        result.add(new PeliculasDto("Batman", "2:50", "Thriller","10:00,12:00,14:10,15:30,17:30"));
        result.add(new PeliculasDto("Sonic 2", "1:42", "Aventura","11:20,11:40,14:50,15:00,18:50"));
        result.add(new PeliculasDto("IT", "2:10", "Terror","10:00,12:00,14:10,15:30,17:30"));
        result.add(new PeliculasDto("Animales Fantasticos", "2:30", "Aventura","11:20,11:40,14:50,15:00,18:50"));

        return result;
    }
}
