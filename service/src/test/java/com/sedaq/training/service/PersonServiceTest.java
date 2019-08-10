package com.sedaq.training.service;

import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.persistence.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static java.util.Arrays.deepEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

import static org.junit.Assert.*;

/**
 * @author Pavel Seda
 */
@RunWith(SpringRunner.class)
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;
    private PersonService personService;

    private Person person;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        personService = new PersonService(personRepository);

        person = new Person();
        person.setEmail("pavelseda@email.cz");
        person.setFirstName("Pavel");
        person.setNickname("SedaQ");
        person.setSurname("Seda");
        person.setPwd("batman".toCharArray());
    }

    @Test
    public void getPersonById() {
        given(personRepository.findById(any(Long.class))).willReturn(Optional.of(person));

        Optional<Person> personResponse = personService.findById(1L);
        assertEquals(personResponse.get(), person);
    }


}
