package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dao.PeliculasDao;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculasBl {

    private PeliculasDao peliculasDao;

    @Autowired
    public PeliculasBl(PeliculasDao peliculasDao) {
        this.peliculasDao = peliculasDao;
    }

    public List<PeliculasDto> findLast10PermissionsByChatId(Long chatId) {

        List<PeliculasDto> Pel = peliculasDao.findAllPeliculas();
        return Pel;
    }

    public void savePeliculas(String nombre, String genero, String duracion){
        peliculasDao.savePeliculas(nombre,duracion,genero);
    }
}
