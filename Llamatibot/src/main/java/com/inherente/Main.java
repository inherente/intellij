package com.inherente;

import com.inherente.bot.Bot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.logging.Logger;

public class Main {
    private static Logger log= Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws TelegramApiException {
        log.info("Hello world.");
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(new Bot());
    }
}