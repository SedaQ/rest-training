package com.sedaq.training.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import com.sedaq.training.facade.config.FacadeConfig;

/**
 * <p>
 * To run with external property file add following to:
 *
 * Eclipse example:
 *
 * <pre>
 * <code>
 *  Run Configuration -> tab: Arguments -> Program arguments
 * </code>
 * </pre>
 * </p>
 *
 * <pre>
 * <code>
 *  --path.to.config.file="/etc/training/training.properties"
 * </code>
 * </pre>
 *
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
 *   --path.to.config.file="/etc/training/training.properties"
 *  </code>
 * </pre>
 *
 * @author Pavel Seda
 *
 */
@SpringBootApplication
@EnableSpringDataWebSupport
@Import({ FacadeConfig.class })
@ComponentScan("com.sedaq.training.rest")
public class RestConfigTraining extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestConfigTraining.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RestConfigTraining.class, args);
	}

}
