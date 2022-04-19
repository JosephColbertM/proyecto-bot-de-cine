package com.botcine.bot_cine.chat.peliculas;

import com.botcine.bot_cine.bl.PeliculasBl;
import com.botcine.bot_cine.chat.*;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class ListaPeliculas extends AbstractProcess {
    public ListaPeliculas() {
        this.setName("Lista de las peliculas");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(Update update, CineLongPollingBot bot) {
        Long chatId = update.getMessage().getChatId();
        PeliculasBl peliculasBl = new PeliculasBl();
        List<PeliculasDto> peliculaList = peliculasBl.findLast10PermissionsByChatId(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("PELÍCULAS EN CARTELERA\n\r\n");
        for(PeliculasDto pelicula: peliculaList) {
            sb.append(pelicula.toString()).append("\n\r");
        }
        sb.append("Ingrese cualquier caracter para volver al menu de películas");
        sendStringBuffer(bot, chatId, sb);
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
