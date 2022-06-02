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

    public List<PeliculasDto> findLast10PermissionsByChatId() {

        List<PeliculasDto> Pel = peliculasDao.findAllPeliculas();
        return Pel;
    }

    public void savePeliculas(String nombre, String duracion, String hora_inicio, String hora_final){
        peliculasDao.savePeliculas(nombre,duracion,hora_inicio,hora_final);
    }
/*
    public PeliculasDto findByName(String nombre) {
        return peliculasDao.showPeliculas(nombre);
    }

    public PeliculasDto findByPeliculasId(Integer peliculasId) {
        return peliculasDao.showHorario(peliculasId);
    }

    public PeliculasDto findHorarioById(Integer peliculasId, Integer horarioId) {
        return peliculasDao.showAsientos(peliculasId, horarioId);
    }
/*
    public void saveTicket(Integer peliculasId) {
        peliculasDao.saveTicket(peliculasId, horarioId, seats);
    }

    public PeliculasDto findDatosPago(Integer datosPagoId) {
        return peliculasDao.showdatosPago(datosPagoId);
    }

 */

    public void addDatosPago(Integer datosPagoId, String payment, String card, String lastDigist, String expirationDate, String name, Integer nit) {
        peliculasDao.addDatosPago(datosPagoId, payment, card, lastDigist, expirationDate, name, nit);
    }
}
