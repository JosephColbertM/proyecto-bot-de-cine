package com.botcine.bot_cine.chat.administradores;

import com.botcine.bot_cine.bl.AdministradorBl;

import com.botcine.bot_cine.chat.AbstractProcess;
import com.botcine.bot_cine.chat.AccesoAdministradores;

import com.botcine.bot_cine.chat.CineLongPollingBot;
import com.botcine.bot_cine.dto.AdministradorDto;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

@Service
public class ListaAdministradores extends AbstractProcess {
    private AdministradorBl administradorBl;

    @Autowired
    public ListaAdministradores(AdministradorBl administradorBl) {
        this.administradorBl = administradorBl;
        this.setName("Lista de los administradores");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, CineLongPollingBot bot) {
        Long chatId = update.getMessage().getChatId();

        List<AdministradorDto> adminList = administradorBl.findLast10PermissionsByChatId(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("ADMINISTRADORES\n\r\n");
        for(AdministradorDto admins: adminList) {
            sb.append(admins.toString()).append("\n\r");
        }
        sb.append("Ingrese cualquier caracter para volver al menu de administradores");
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
