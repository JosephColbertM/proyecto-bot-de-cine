package com.botcine.bot_cine.chat.administradores;

import com.botcine.bot_cine.bl.AdministradorBl;

import com.botcine.bot_cine.bl.PeliculasBl;
import com.botcine.bot_cine.chat.AbstractProcess;
import com.botcine.bot_cine.chat.AccesoAdministradores;

import com.botcine.bot_cine.chat.CineLongPollingBot;
import com.botcine.bot_cine.dto.AdministradorDto;

import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;
import java.util.List;

@Service
public class ListaAdministradores extends AbstractProcess {
    private AdministradorBl administradorBl;
    private static Logger LOGGER = LoggerFactory.getLogger(AdministradorBl.class);


    @Autowired
    public ListaAdministradores(AdministradorBl administradorBl) {
        this.administradorBl = administradorBl;
        this.setName("Lista de los administradores");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, CineLongPollingBot bot) {
        LOGGER.info("Handle admin");
        Long chatId = update.getMessage().getChatId();
        List<AdministradorDto> adminList = administradorBl.listadoDeAdministradores(chatId);
        StringBuffer sb = new StringBuffer();

        sb.append("ADMINISTRADORES\r\n");
        for(AdministradorDto admins: adminList) {
            LOGGER.info("Entrada funcion");
            sb.append(admins.toString()).append("\n\r");
        }
        //sb.append("Ingrese cualquier caracter para volver al menu de administradores");
        //sendStringBuffer(bot, chatId, sb);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(sb.toString());
        try {
            bot.execute(sendMessage);
        } catch (Exception ex) {
            // relanzamos la excepción
            throw new RuntimeException(ex);
        }
        return context.getBean(AccesoAdministradores.class);
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
