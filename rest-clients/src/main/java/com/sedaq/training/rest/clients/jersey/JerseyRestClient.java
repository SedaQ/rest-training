package com.sedaq.training.rest.clients.jersey;

import com.sedaq.training.rest.api.dto.PersonDTO;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 * Based on article: https://www.baeldung.com/jersey-jax-rs-client
 *
 * @author Pavel Seda
 */
public class JerseyRestClient {

    private static final String REST_URI = "http://localhost:8080/rest-training/api/v1/persons";
    private Client client = ClientBuilder.newClient();

    public static void main(String[] args) {
        JerseyRestClient jrc = new JerseyRestClient();

        // get person with specific ID
        PersonDTO person = jrc.getJsonPersonDTO(1);
        System.out.println(person);


        // create following person
        PersonDTO personDTO = new PersonDTO();
        personDTO.setAge(12);
        personDTO.setBirthday(Year.of(1200).atMonth(Month.APRIL).atDay(21));
        personDTO.setEmail("pavelseda@email.cz");
        personDTO.setFirstName("Pavel");
        personDTO.setNickname("SedaQ");
        personDTO.setSurname("Seda");

        Response response = jrc.createJsonPersonDTO(personDTO);
    }

    public PersonDTO getJsonPersonDTO(int id) {
        return client
                .target(REST_URI)
                .path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
//                .header("X-Authorization","Bearer XXX")
                .get(PersonDTO.class);
    }

    public Response createJsonPersonDTO(PersonDTO person) {
        return client
                .target(REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(person, MediaType.APPLICATION_JSON));
    }

}
