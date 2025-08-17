package com.springsecurityregistration.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springsecurityregistration.security.ActiveUserStore;

@Configuration
public class AppConfig {
    // beans

    @Bean
    public ActiveUserStore activeUserStore() {
        return new ActiveUserStore();
    }

}