package com.springmvc.config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Log4jConfig {

    @Bean
    public LoggerContext loggerContext() {
        return (LoggerContext) LogManager.getContext(false);
    }
}
