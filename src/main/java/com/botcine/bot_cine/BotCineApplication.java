package com.botcine.bot_cine;


import com.botcine.bot_cine.chat.CineLongPollingBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


@SpringBootApplication
public class BotCineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BotCineApplication.class, args);
		try {
			//Inicializamos libreria de bots
			TelegramBotsApi telegramApi = new TelegramBotsApi(DefaultBotSession.class);
			//Registramos la implementacion de nuestro BOT
			telegramApi.registerBot(new CineLongPollingBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
