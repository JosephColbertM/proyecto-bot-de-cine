package com.botcine.bot_cine.chat.administradores;

import com.botcine.bot_cine.bl.AdministradorBl;
import com.botcine.bot_cine.chat.AbstractProcess;
import com.botcine.bot_cine.chat.AccesoAdministradores;
import com.botcine.bot_cine.chat.CineLongPollingBot;
import com.botcine.bot_cine.dto.AdministradorDto;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class EliminarAdministrador extends AbstractProcess {
    public EliminarAdministrador() {
        this.setName("Eliminar un administrador");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }
    @Override
    public AbstractProcess handle(Update update, CineLongPollingBot bot) {
        int c=1;
        Long chatId = update.getMessage().getChatId();
        AdministradorBl administradorBl = new AdministradorBl();
        List<AdministradorDto> adminList = administradorBl.findLast10PermissionsByChatId(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("ADMINISTRADORES\n\r");
        sb.append("Ingrese el número del administrador que desea eliminar\n\r\n");
        for(AdministradorDto admins: adminList) {
            sb.append(c).append("\n\r");
            sb.append(admins.toString()).append("\n\r");
            c++;
        }
        sendStringBuffer(bot, chatId, sb);
        return new AccesoAdministradores();
    }

    @Override
    public AbstractProcess onError() {
        return null;
    }

    @Override
    public AbstractProcess onSuccess() {
        return null;
    }

    @Override
    public AbstractProcess onTimeout() {
        return null;
    }
}
