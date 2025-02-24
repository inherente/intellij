package com.inherente;

import com.inherente.bot.Bot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.updates.DeleteWebhook;
import org.telegram.telegrambots.meta.api.methods.updates.GetWebhookInfo;
import org.telegram.telegrambots.meta.api.objects.WebhookInfo;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.logging.Logger;

public class Main {
    private static Logger log= Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        log.info("Hello world.");
        TelegramBotsApi botsApi = null;

        Bot bot = new Bot();

        try {
         // Check if webhook exists before trying to delete it
            log.info("Check if webhook exists before trying to delete it");
            WebhookInfo webhookInfo = bot.execute(new GetWebhookInfo());
            log.info("Got webhook info");
            if (webhookInfo.getUrl() == null || webhookInfo.getUrl().isEmpty()) {
                log.info("No webHook defined");
            } else {
                log.info(webhookInfo.getUrl());
                bot.execute(new DeleteWebhook());  // Only delete if a webhook is set
            }
        } catch (TelegramApiException error) {
            log.info("Skipping webhook deletion: ") ;
            log.info(error.getMessage());
        }

        try {

            botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(bot);

        } catch (TelegramApiException error) {
            log.info("Bot initialization failed");
            log.info(error.getMessage());
        }
    }
}