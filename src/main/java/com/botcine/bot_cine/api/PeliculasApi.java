package com.botcine.bot_cine.api;

import com.botcine.bot_cine.bl.PeliculasBl;
import com.botcine.bot_cine.dto.DatosPagoDto;
import com.botcine.bot_cine.dto.HorariosDto;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class PeliculasApi {
    private PeliculasBl  peliculasBl;

    @Autowired
    public PeliculasApi(PeliculasBl peliculasBl) {
        this.peliculasBl = peliculasBl;
    }
    @GetMapping(value = "/peliculas", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PeliculasDto> findLast10PermissionsByChatId() {
        return peliculasBl.findLast10PermissionsByChatId();
    }

    @GetMapping(value = "/peliculas/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PeliculasDto findById(@PathVariable("nombre") String nombre) {
        return peliculasBl.findByName(nombre);
    }

    @GetMapping(value = "/peliculas/{peliculasId}/horario", produces = MediaType.APPLICATION_JSON_VALUE)
    public PeliculasDto findHorarioById(@PathVariable("peliculasId") Integer peliculasId) {
        return peliculasBl.findByPeliculasId(peliculasId);
    }

    @GetMapping(value = "/peliculas/{peliculasId}/horario/{horarioId}&state=true", produces = MediaType.APPLICATION_JSON_VALUE)
    public PeliculasDto findByIds@PathVariable("peliculasId") Integer peliculasId, @PathVariable("horarioId") Integer horarioId) {
        return peliculasBl.findByIds(peliculasId, horarioId);
    }

    @PostMapping(path="/compraTicket", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public String addTicket(@RequestBody PeliculasDto  peliculasDto, HorariosDto horarioDto) {
        peliculasBl.saveTicket(peliculasDto.getPeliculasId(), HorariosDto.getHorarioId());
        return "Datos Registrados";
    }

    @GetMapping(value = "/datosPago/{datosPagoId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PeliculasDto findByIdPago(@PathVariable("datosPagoId") Integer datosPagoId){
        return peliculasBl.findDatosPago(datosPagoId);
    }

    @PostMapping(path="/datosPago", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public String addDatosPago (@RequestBody DatosPagoDto datosPagoDto) {
        peliculasBl.saveDatosPago(datosPagoDto.getDatosPagoId(), datosPagoDto.getPayment(),datosPagoDto.getCard(), datosPagoDto.getLastDigist(),
                datosPagoDto.getExpirationDate(), datosPagoDto.getName(), datosPagoDto.getNit());
        return "Datos del Pago Registrado";
    }
}
