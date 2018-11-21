package com.sedaq.training.facade.config;

import com.sedaq.training.facade.validation.EmailValidator;
import com.sedaq.training.service.config.ServiceConfig;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Pavel Šeda
 */
@Configuration
@EnableTransactionManagement
@Import({ServiceConfig.class, ValidationMessagesConfig.class})
@ComponentScan(basePackages = {"com.sedaq.training.facade.iface", "com.sedaq.training.facade.impl",
        "com.sedaq.training.facade.mapping"})
public class FacadeConfig {

    private static final Logger LOG = LoggerFactory.getLogger(FacadeConfig.class);

    @Bean
    public ModelMapper modelMapper() {
        LOG.debug("modelMapper()");
        return new ModelMapper();
    }

    @Bean
    public EmailValidator usernameValidator() {
        LOG.debug("usernameValidator()");
        return new EmailValidator();
    }

}
