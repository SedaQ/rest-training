package com.sedaq.training.rest.clients.standardjavaseapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sedaq.training.rest.api.dto.PersonDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.ws.rs.core.MediaType;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Month;
import java.time.Year;

/**
 * @author Pavel Seda
 */
public class HttpUrlConnectionClient {

    private static final String REST_URI = "http://localhost:8080/rest-training/api/v1/persons";
    private static final ObjectMapper obj = new ObjectMapper();


    public static void main(String[] args) {
        HttpUrlConnectionClient hucc = new HttpUrlConnectionClient();
        obj.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        obj.registerModule(new JavaTimeModule());


        // authentication
        String userPassword = "user" + ":" + "userPwd";
        String encoding = new BCryptPasswordEncoder().encode(userPassword);

        // GET person with ID 1
        PersonDTO personDTO = hucc.getJsonPersonDTO(encoding, 1);
        System.out.println(personDTO);

        // CREATE person
        // create following person
        PersonDTO personDtoCreate = new PersonDTO();
        personDtoCreate.setAge(12);
        personDtoCreate.setBirthday(Year.of(1200).atMonth(Month.APRIL).atDay(21));
        personDtoCreate.setEmail("pavelseda@email.cz");
        personDtoCreate.setFirstName("Pavel");
        personDtoCreate.setNickname("SedaQ");
        personDtoCreate.setSurname("Seda");

        int responseCode = hucc.createPersonDto(encoding, personDtoCreate);
        System.out.println("ResponseCode: " + responseCode);
    }

    public PersonDTO getJsonPersonDTO(String userEncoded, int id) {
        try {
            URL url = new URL(REST_URI + "/" + id);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Basic " + userEncoded);

            InputStream ins = connection.getInputStream();

            PersonDTO person = obj.readValue(ins, PersonDTO.class);

            ins.close();
            connection.disconnect();
            return person;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NullPointerException("Person not found");
        }
    }

    public int createPersonDto(String userEncoded, PersonDTO personDto) {
        try {
            URL url = new URL(REST_URI);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Basic " + userEncoded);

            OutputStream os = connection.getOutputStream();
            obj.writeValue(os, personDto);

            os.flush();
            os.close();

            int responseCode = connection.getResponseCode();
            connection.disconnect();
            return responseCode;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NullPointerException("Person not Created");
        }
    }

}
