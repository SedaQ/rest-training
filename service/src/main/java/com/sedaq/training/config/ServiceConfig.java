package com.sedaq.training.config;

import com.sedaq.training.api.validation.EmailValidator;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sedaq.training.persistence.config.PersistenceConfig;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Pavel Šeda
 */
@Configuration
@EnableTransactionManagement
@Import({PersistenceConfig.class, BCryptEncoder.class})
@ComponentScan(basePackages = {"com.sedaq.training.service", "com.sedaq.training.facade", "com.sedaq.training.mapping"})
public class ServiceConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
