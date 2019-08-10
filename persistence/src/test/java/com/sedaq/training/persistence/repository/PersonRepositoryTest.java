package com.sedaq.training.persistence.repository;

import com.sedaq.training.persistence.config.PersistenceConfigTest;
import com.sedaq.training.persistence.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(PersistenceConfigTest.class)
public class PersonRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private PersonRepository personRepository;

    @SpringBootApplication
    static class TestConfiguration{}

    private Person person;

    @Before
    public void setUp(){
        person = new Person();
        person.setEmail("pavelseda@email.cz");
        person.setFirstName("Pavel");
        person.setNickname("SedaQ");
        person.setSurname("Seda");
        person.setPwd("batman".toCharArray());
    }

    @Test
    public void findPersonByIdTest() {
        Long id = (Long) entityManager.persistAndGetId(person);
        Optional<Person> optionalPerson = personRepository.findById(id);
        assertTrue(optionalPerson.isPresent());
        assertEquals(person, optionalPerson.get());
    }

}
