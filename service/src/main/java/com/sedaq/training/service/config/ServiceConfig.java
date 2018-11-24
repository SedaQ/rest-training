package com.sedaq.training.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sedaq.training.persistence.config.PersistenceConfig;

/**
 * @author Pavel Šeda
 */
@Configuration
@Import(PersistenceConfig.class)
@ComponentScan(basePackages = {"com.sedaq.training.service.iface", "com.sedaq.training.service.impl"})
public class ServiceConfig {

}
