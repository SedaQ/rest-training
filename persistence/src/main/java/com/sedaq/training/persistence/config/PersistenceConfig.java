package com.sedaq.training.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author Pavel Šeda
 *
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.sedaq.training.persistence" })
@EntityScan(basePackages = { "com.sedaq.training.persistence.model" })
@EnableJpaRepositories(basePackages = { "com.sedaq.training.persistence.repository" })
public class PersistenceConfig {

}
