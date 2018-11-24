package com.sedaq.training.rest.clients.restassured;

import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

import com.sedaq.training.rest.api.dto.PersonDTO;
import org.hamcrest.Matchers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * Rest Assured is commonly used for testing REST API.
 *
 * @author Pavel Seda
 */
public class RestAssuredClientExample {

    private static final String REST_URI = "http://localhost:8080/rest-training/api/v1/persons";

    public static void main(String[] args) {
        RestAssuredClientExample race = new RestAssuredClientExample();
        String response = race.getPersonDtoString(1);
        System.out.println(response);

        PersonDTO personDto = race.getPersonDTO(1);
        System.out.println(personDto);

        // test
        race.getPersonDtoTest(1);
    }

    public String getPersonDtoString(int id) {
        Response response = get(REST_URI + "/" + id);
        return response.asString();
    }

    public PersonDTO getPersonDTO(int id) {
        Response response = get(REST_URI + "/" + id);
        return response.getBody().as(PersonDTO.class);
    }

    public void getPersonDtoTest(int id) {
        Response response = get(REST_URI + "/" + id);
        System.out.println(response.then().body("id_person", equalTo(1)));
        System.out.println(response.then().body("email", equalTo("radek.kruta@seznam.cz")));
    }

}
