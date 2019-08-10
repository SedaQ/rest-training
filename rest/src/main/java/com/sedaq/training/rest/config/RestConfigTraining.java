package com.sedaq.training.rest.config;

import com.sedaq.training.config.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


/**
 * <p>
 * To run with external property file add following to:
 * <p>
 * Intellij idea example:
 *
 * <pre>
 *  <code>
 *   Run Configuration -> tab: Arguments -> Program arguments
 *  </code>
 * </pre>
 * </p>
 *
 * <pre>
 *  <code>
 *   --path.to.config.file=../ansible/properties/training.properties
 *  </code>
 * </pre>
 *
 * @author Pavel Seda
 */
@SpringBootApplication(scanBasePackages = "com.sedaq.training.rest")
@EnableSpringDataWebSupport
@Import({ServiceConfig.class, com.sedaq.training.security.RestSecurityConfiguration.class})
@PropertySource("file:${path.to.config.file}")
public class RestConfigTraining extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestConfigTraining.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RestConfigTraining.class, args);
    }

}
