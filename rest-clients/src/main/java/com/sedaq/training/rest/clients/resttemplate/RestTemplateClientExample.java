package com.sedaq.training.rest.clients.resttemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sedaq.training.rest.api.dto.PersonDTO;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

/**
 * @author Pavel Seda
 */
public class RestTemplateClientExample {

    private static final String REST_URI = "http://localhost:8080/rest-training/api/v1/persons";
    private RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        RestTemplateClientExample rtce = new RestTemplateClientExample();
        rtce.messageConverter();

        String s = rtce.getPersonDtoString(1);
        System.out.println(s);

        PersonDTO person = rtce.getPersonDto(1);
        System.out.println(person);
    }

    public String getPersonDtoString(int id) {
        HttpEntity<String> entity = new HttpEntity<>(createHttpHeaders("user", "userPwd"));

        ResponseEntity<String> response = restTemplate.exchange(REST_URI + "/" + id, HttpMethod.GET, entity, String.class);
        return response.getBody();
    }


    public PersonDTO getPersonDto(int id) {
        HttpEntity<String> entity = new HttpEntity<>(createHttpHeaders("user", "userPwd"));
        ResponseEntity<PersonDTO> response = restTemplate.exchange(REST_URI + "/" + id, HttpMethod.GET, entity, PersonDTO.class);
        if (response.getStatusCode().isError()) {
            // log user not found
        }
        return response.getBody();
    }

    private HttpHeaders createHttpHeaders(String user, String password) {
        String notEncoded = user + ":" + password;
        String encodedAuth = "Basic " + Base64.getEncoder().encodeToString(notEncoded.getBytes());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", encodedAuth);
        return headers;
    }

    private MappingJackson2HttpMessageConverter messageConverter() {
        ObjectMapper obj = new ObjectMapper();
        obj.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        obj.registerModule(new JavaTimeModule());

        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        messageConverter.setPrettyPrint(false);
        messageConverter.setObjectMapper(obj);
        restTemplate.getMessageConverters().removeIf(m -> m.getClass().getName().equals(MappingJackson2HttpMessageConverter.class.getName()));
        restTemplate.getMessageConverters().add(messageConverter);

        return messageConverter;
    }

}
