package com.botcine.bot_cine.api;

import com.botcine.bot_cine.bl.AdministratorBl;
import com.botcine.bot_cine.dto.AdministradorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class AdministradorApi {
    private AdministratorBl administratorBl;

    @Autowired
    public AdministradorApi(AdministratorBl administratorBl) {
        this.administratorBl = administratorBl;
    }

    @GetMapping(value = "/administrators", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AdministradorDto> listAll() {
        return administratorBl.listAdmins();
    }

    @PostMapping(path="/administrators", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public String addAdministrador(@RequestBody AdministradorDto administradorDto) {
        administratorBl.saveAdministrador(administradorDto.getNombre(),administradorDto.getApellido(),administradorDto.getUsuario(),administradorDto.getPassword(),administradorDto.getBot_chat_id());
        return "Administrador Registrado";
    }
}
