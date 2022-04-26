package com.botcine.bot_cine.chat;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;

public class MenuCandyBar extends AbstractProcess{
    public MenuCandyBar(){
        this.setName("Menú CandyBar");
        this.setDefault(true);
        this.setExpires(false);
        this.setStartDate(System.currentTimeMillis()/1000);
        this.setUserData(new HashMap<>());
        this.setStatus("STARTED");
    }

    @Override
    public AbstractProcess handle(Update update, CineLongPollingBot bot) {
        AbstractProcess result = this; // sigo en el mismo proceso.
        Long chatId = update.getMessage().getChatId();

        if (this.getStatus().equals("STARTED")) {

            showMainMenu(bot, chatId);
        } else if (this.getStatus().equals("AWAITING_USER_RESPONSE")) {
            // Estamos esperando por un numero 1 o 2
            Message message = update.getMessage();
            if ( message.hasText() ) {
                // Intentamos transformar en número
                String text = message.getText(); // El texto contiene asdasdas
                try {
                    int opcion = Integer.parseInt(text);
                    switch (opcion){
                        case 1 : result = new Cantidad();
                            break;
                        case 2 : result = new Cantidad();
                            break;
                        case 3 : result = new Cantidad();
                            break;
                        case 4 : result = new Cantidad();
                            break;
                        case 5 : result = new Cantidad();
                            break;
                        case 6 : result = new AgregarProducto();
                            break;
                        case 7 : result = new AccesoCliente();
                            break;

                        default: showMainMenu(bot, chatId);
                    }
                } catch (NumberFormatException ex) {
                    showMainMenu(bot, chatId);
                }
                // continuar con el proceso seleccionado
            } else { // Si me enviaron algo diferente de un texto.
                showMainMenu(bot, chatId);
            }
        }
        return result;
    }
    private void showMainMenu(CineLongPollingBot bot, Long chatId) {
        StringBuffer sb = new StringBuffer();
        sb.append("MENU CANDY-BAR\r\n");
        sb.append("1. Pipocas saladas 15 Bs p/u\r\n");
        sb.append("2. Pipocas dulces 10 Bs p/u\r\n");
        sb.append("3. Soda Grande 14 Bs p/u\r\n");
        sb.append("4. Soda Puequeña 9 Bs p/u\r\n");
        sb.append("5. Chocolate Kit-Kat 8 Bs p/u\r\n");
        sb.append("6. Cancelar\r\n");
        sb.append("7. Volver al menu principal\r\n");

        sb.append("Elija una opción:\r\n");
        sendStringBuffer(bot, chatId, sb);

        this.setStatus("AWAITING_USER_RESPONSE");
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