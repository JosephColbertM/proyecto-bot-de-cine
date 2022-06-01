package com.botcine.bot_cine.bl;

import com.botcine.bot_cine.dao.AdministradorDao;
import com.botcine.bot_cine.dto.AdministradorDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdministratorBl {

    private AdministradorDao administradorDao;

    public AdministratorBl(AdministradorDao administradorDao) {
        this.administradorDao = administradorDao;
    }

    public List<AdministradorDto> listAdmins(){
        return administradorDao.findAllAdministradores();
    }

    public void saveAdministrador(String nombre, String apellido, String usuario, String password, String bot_chat_id){
        administradorDao.saveAdministrador(nombre, apellido, usuario, password, bot_chat_id);
    }

    public void updateAdministrator(Integer ca, String nombre, String apellido, String usuario, String password, String bot_chat_id) {
        administradorDao.updateAdministrator(ca,nombre,apellido,usuario, password, bot_chat_id);
    }

    public void deleteAdministrator(Integer idAdministrator) {
        administradorDao.deleteAdministrator(idAdministrator);
    }

    public void deleteAdministrator2(Integer idAdministrator) {
        administradorDao.deleteAdministrator2(idAdministrator);
    }

    public AdministradorDto findById(Integer idAdministrador) {
        return administradorDao.findById(idAdministrador);

    }
}
