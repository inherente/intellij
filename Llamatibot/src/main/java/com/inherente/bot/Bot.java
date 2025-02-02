package com.inherente.bot;
import com.inherente.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;


public class Bot extends TelegramLongPollingBot {
    private static Logger log= LoggerFactory.getLogger(Bot.class);

    /**
     * @return
     */
    public String getBotUsername() {
        return "llamatibot";
    }

    /**
     * @return
     */
    public String getBotToken() {
        return "bot8086286665:AAFoPhXWBLYRkOuMkAKglLZCZNDmj5vscug";
    }

    /**
     * @param update
     */
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        var user = msg.getFrom();
        log.info(" FirstName {} . Message []",user.getFirstName() , msg.getText());
    }
}
