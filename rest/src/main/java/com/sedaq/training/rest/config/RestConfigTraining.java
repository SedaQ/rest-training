package com.sedaq.training.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.*;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
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
@PropertySource("file:${path.to.config.file}")
public class RestConfigTraining extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestConfigTraining.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RestConfigTraining.class, args);
	}

	@Bean
	@Primary
	public MappingJackson2HttpMessageConverter jacksonHTTPMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		jsonConverter.setObjectMapper(objectMapperForRestAPI());
		return jsonConverter;
	}

	@Bean(name = "objMapperRESTApi")
	@Primary
	public ObjectMapper objectMapperForRestAPI() {
		ObjectMapper obj = new ObjectMapper();
		obj.registerModule(new JavaTimeModule());
		obj.setPropertyNamingStrategy(snakeCase());
		return obj;
	}

	/**
	 * Naming strategy for returned JSONs.
	 *
	 * @return Naming Strategy for JSON properties
	 */
	@Bean(name = "properyNamingSnakeCase")
	public PropertyNamingStrategy snakeCase() {
		return PropertyNamingStrategy.SNAKE_CASE;
	}

}
