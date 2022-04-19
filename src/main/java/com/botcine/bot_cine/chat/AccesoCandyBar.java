package com.botcine.bot_cine.chat;

import com.botcine.bot_cine.chat.CandyBar.AgregarProducto;
import com.botcine.bot_cine.chat.CandyBar.EliminarProducto;
import com.botcine.bot_cine.chat.CandyBar.ListaProducto;
import com.botcine.bot_cine.chat.CandyBar.ModificarProducto;
import com.botcine.bot_cine.chat.administradores.AgregarAdministrador;
import com.botcine.bot_cine.chat.administradores.ListaAdministradores;
import com.botcine.bot_cine.chat.peliculas.EliminarPelicula;
import com.botcine.bot_cine.chat.peliculas.ModificarPelicula;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;

public class AccesoCandyBar extends AbstractProcess{
    public AccesoCandyBar (){
        this.setName("Acceso al menu de CandyBar");
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
                        case 1 : result = new AgregarProducto();
                            break;
                        case 2 : result = new ModificarProducto();
                            break;
                        case 3 : result = new EliminarProducto();
                            break;
                        case 4 : result = new ListaProducto();
                            break;
                        case 0 : result = new MenuAdministrador();
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
        sb.append("MENU DE ACCESO CANDY-BAR\r\n");
        sb.append("1. Agregar\r\n");
        sb.append("2. Modificar\r\n");
        sb.append("3. Eliminar\r\n");
        sb.append("4. Lista\r\n");
        sb.append("0. Salir\r\n");
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