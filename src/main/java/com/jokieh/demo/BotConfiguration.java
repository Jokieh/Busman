package com.jokieh.demo;

import discord4j.core.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BotConfiguration {

    @Value("${token}")
    private String token;

    @Bean
    public GatewayDiscordClient gatewayDiscordClient () {
        return DiscordClientBuilder.create(token)
                .build()
                .login()
                .block();


    }

}
