package com.botcine.bot_cine.chat.administradores;

import com.botcine.bot_cine.chat.AbstractProcess;
import com.botcine.bot_cine.chat.CineLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class EliminarAdministrador extends AbstractProcess {
    @Override
    public AbstractProcess handle(Update update, CineLongPollingBot bot) {
        return null;
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
