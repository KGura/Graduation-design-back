package com.example.myrobot;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@SpringBootApplication
public class MyRobotApplication {

	public static void main(String[] args) throws TelegramApiException {
		String proxyHost = "127.0.0.1";
		int proxyPort = 7890;
		HttpHost proxy = new HttpHost(proxyHost, proxyPort);
		RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
		CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(config).build();

		SpringApplication.run(MyRobotApplication.class, args);
		TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
		botsApi.registerBot(new Bot());
	}

}
