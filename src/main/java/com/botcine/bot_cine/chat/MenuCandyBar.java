package com.botcine.bot_cine.chat;

import com.botcine.bot_cine.bl.MenuCandybarBL;
import com.botcine.bot_cine.dto.MenuCandybarDto;
import com.botcine.bot_cine.dto.PeliculasDto;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;
import java.util.List;

@Service
public class MenuCandyBar extends AbstractProcess{
    private MenuCandybarBL menuCandybarBl;

    @Autowired
    public MenuCandyBar(MenuCandybarBL menuCandybarBl){
        this.setName("Menú CandyBar");
        this.menuCandybarBl = menuCandybarBl;
        this.setDefault(true);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }


    @Override
    public AbstractProcess handle(ApplicationContext context, Update update, CineLongPollingBot bot) {

        Long chatId = update.getMessage().getChatId();
        List<MenuCandybarDto> menuList = menuCandybarBl.findLast10PermissionsByChatId(chatId);
        StringBuffer sb = new StringBuffer();
        sb.append("Lista de peliculas:\r\n\n");
        for (MenuCandybarDto menu: menuList){
            sb.append(menu.toString()).append("\n\r");
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
        return context.getBean(AccesoCliente.class);


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
