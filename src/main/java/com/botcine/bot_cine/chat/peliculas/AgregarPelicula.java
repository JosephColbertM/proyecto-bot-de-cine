package com.botcine.bot_cine.chat.peliculas;

import com.botcine.bot_cine.chat.AbstractProcess;
import com.botcine.bot_cine.chat.AccesoPeliculas;
import com.botcine.bot_cine.chat.CineLongPollingBot;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class AgregarPelicula extends AbstractProcess {
    public AgregarPelicula() {
        this.setName("Agregar película");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }


    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, CineLongPollingBot bot) {
        int c = 1;
        Long chatId = update.getMessage().getChatId();
        List<PeliculasDto> peliculaList = peliculasBl.savePelicualas;//cambiar
        StringBuffer sb = new StringBuffer();
        sb.append("PARA AGREGAR UNA PELÍCULA, DEBERA INGRESAR LOS DATOS EN EL SIGUIENTE ORDEN:\r\n\n");
        sb.append("Nombre: \r\n");
        sb.append("Duración: \r\n");
        sb.append("Genero: \r\n");

        for(PeliculasDto pelicula: peliculaList) {
            sb.append(c).append("\n\r");
            sb.append(pelicula.toString()).append("\n\r");
            c++;
        }

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(sb.toString());
        try {
            bot.execute(sendMessage);
        } catch (Exception ex) {
            // relanzamos la excepción
            throw new RuntimeException(ex);
        }
        return new AccesoPeliculas();
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
