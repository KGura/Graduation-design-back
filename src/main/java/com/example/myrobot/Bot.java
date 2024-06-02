package com.example.myrobot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
public class Bot extends TelegramLongPollingBot{
    @Override
    public String getBotUsername() {
        return "TestBot";
    }

    @Override
    public String getBotToken() {
        return "6819232559:AAELFl4Bu_JdBEHcqfV73jGJ_Y_0jCcWlpk";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }
}
