package com.sedaq.training.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Pavel Seda (441048)
 */
@Configuration
@ComponentScan(basePackages = {"com.sedaq.training.persistence.model", "com.sedaq.training.persistence.repository"})
@EntityScan(basePackages = "com.sedaq.training.persistence.model")
@EnableJpaRepositories(basePackages = "com.sedaq.training.persistence.repository")
public class PersistenceConfigTest {
}
