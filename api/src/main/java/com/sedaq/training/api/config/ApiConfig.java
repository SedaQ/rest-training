package com.sedaq.training.api.config;

import com.sedaq.training.api.validation.EmailValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Pavel Šeda
 */
@Configuration
@Import({ValidationMessagesConfig.class})
public class ApiConfig {

    private static final Logger LOG = LoggerFactory.getLogger(ApiConfig.class);

    @Bean
    public EmailValidator usernameValidator() {
        LOG.debug("usernameValidator()");
        return new EmailValidator();
    }

}
