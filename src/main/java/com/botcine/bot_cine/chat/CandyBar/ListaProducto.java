package com.botcine.bot_cine.chat.CandyBar;

import com.botcine.bot_cine.bl.CandyBarBl;
import com.botcine.bot_cine.chat.AbstractProcess;
import com.botcine.bot_cine.chat.AccesoCandyBar;
import com.botcine.bot_cine.chat.CineLongPollingBot;
import com.botcine.bot_cine.dto.CandyBarDto;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

public class ListaProducto extends AbstractProcess {
    private CandyBarBl candyBarBl;

    public ListaProducto(CandyBarBl candyBarBl){
        this.setName("Eliminar un producto");
        this.setDefault(false);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        //this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, CineLongPollingBot bot) {
        Long chatId = update.getMessage().getChatId();
        List<CandyBarDto> CandyBarList= candyBarBl.findLast10PermissionsByChatId(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("MENU CANDY-BAR\n\r\n");
        for(CandyBarDto menu: CandyBarList){
            sb.append(menu.toString()).append("\n\r");
        }
        sb.append("Ingrese cualquier caracter para volver al menu de opciones");
        sendStringBuffer(bot, chatId, sb);
        return new AccesoCandyBar();
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
