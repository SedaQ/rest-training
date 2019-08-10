package com.sedaq.training.rest.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.Request;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.nio.charset.Charset;

@Configuration
@ComponentScan(basePackages = {"com.sedaq.training.persistence.model", "com.sedaq.training.persistence.repository", "com.sedaq.training.service", "com.sedaq.training.facade"
        , "com.sedaq.training.rest"})
@EntityScan(basePackages = "com.sedaq.training.persistence.model")
@PropertySource("application.properties")
@Import(com.sedaq.training.security.RestSecurityConfiguration.class)
@EnableJpaRepositories(basePackages = "com.sedaq.training.persistence.repository")
public class RestConfigTest {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate rT = Mockito.mock(RestTemplate.class);//new RestTemplate();
        rT.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return rT;
    }

    @Bean
    @Qualifier("objMapperRESTApi")
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper;
    }

    @Bean
    public HttpServletRequest httpServletRequest() {
        return new HttpServletRequestWrapper(new Request(new Connector()));
    }
}
