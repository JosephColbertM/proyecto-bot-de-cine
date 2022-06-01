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

    @PutMapping(path= "/administrators", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public String updateAdministrador(@RequestBody AdministradorDto administradorDto){
        administratorBl.updateAdministrator(administradorDto.getCa(),administradorDto.getNombre(),administradorDto.getApellido(),administradorDto.getUsuario(),administradorDto.getPassword(),administradorDto.getBot_chat_id());
        return "Administrador Actualizado";
    }

    @DeleteMapping(path= "/administrators", produces = MediaType.APPLICATION_JSON_VALUE )
    public String deleteAdministrador(@RequestParam ("idAdministrator")Integer idAdministrator){
        administratorBl.deleteAdministrator(idAdministrator);
        return "Eliminado exitoso";
    }

    @PutMapping(path= "/administrators/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteAdministrador2(@RequestParam ("idAdministrator") Integer idAdministrator){
        administratorBl.deleteAdministrator2(idAdministrator);
        return "Eliminado status";
    }

    @GetMapping(value = "/administrators/{idAdministrador}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AdministradorDto findById(@PathVariable ("idAdministrador") Integer idAdministrador) {
        return administratorBl.findById(idAdministrador);
    }

}
