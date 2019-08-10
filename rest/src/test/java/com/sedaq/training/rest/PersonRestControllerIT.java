package com.sedaq.training.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sedaq.training.api.dto.PersonDTO;
import com.sedaq.training.facade.PersonFacade;
import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.persistence.repository.PersonRepository;
import com.sedaq.training.rest.config.DBTestUtil;
import com.sedaq.training.rest.config.RestConfigTest;
import com.sedaq.training.rest.controllers.PersonRestController;
import com.sedaq.training.service.PersonService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.querydsl.SimpleEntityPathResolver;
import org.springframework.data.querydsl.binding.QuerydslBindingsFactory;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.querydsl.QuerydslPredicateArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = PersonRestController.class)
@DataJpaTest
@Import(RestConfigTest.class)
@TestPropertySource(locations="classpath:application.properties")
public class PersonRestControllerIT {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private PersonRestController personRestController;
    @Autowired
    private PersonFacade personFacade;
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    @Qualifier("objMapperRESTApi")
    private ObjectMapper mapper;
    @Autowired
    private ModelMapper modelMapper;
    private MockMvc mvc;
    private PersonDTO personDto;
    private Person person;

    @SpringBootApplication
    static class TestConfiguration {
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        this.mvc = MockMvcBuilders.standaloneSetup(personRestController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver(),
                        new QuerydslPredicateArgumentResolver(new QuerydslBindingsFactory(SimpleEntityPathResolver.INSTANCE), Optional.empty()))
                .setMessageConverters(new MappingJackson2HttpMessageConverter()).build();
        personDto = new PersonDTO();
        personDto.setEmail("pavelseda@email.cz");
        personDto.setFirstName("Pavel");
        personDto.setNickname("SedaQ");
        personDto.setSurname("Seda");

    }

    @After
    public void reset() throws SQLException {
        DBTestUtil.resetAutoIncrementColumns(applicationContext, "person");
    }

    @Test
    public void findTrainingRunById() throws Exception {
        Person personExpected = personRepository.save(person);

        MockHttpServletResponse result = mvc.perform(get("/persons/{id}", personExpected.getIdPerson()))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        PersonDTO personDTO = modelMapper.map(personExpected, PersonDTO.class);
        personDTO.setBirthday(LocalDate.now());
        PersonDTO resultDTO = mapper.readValue(convertJsonBytesToString(result.getContentAsString()), PersonDTO.class);
        assertEquals(personDTO.toString(), resultDTO.toString());
    }

    private static String convertJsonBytesToString(String object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(object, String.class);
    }
}
