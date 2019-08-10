package com.sedaq.training.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.sedaq.training.api.dto.PersonDTO;
import com.sedaq.training.facade.PersonFacade;
import com.sedaq.training.rest.controllers.PersonRestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.querydsl.SimpleEntityPathResolver;
import org.springframework.data.querydsl.binding.QuerydslBindingsFactory;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.querydsl.QuerydslPredicateArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Pavel Seda
 */
@RunWith(SpringRunner.class)
public class PersonRestControllerTest {

    private PersonRestController personRestController;
    @Mock
    private PersonFacade personFacade;
    @Mock
    private ObjectMapper objectMapper;
    private MockMvc mockMvc;
    private PersonDTO personDto;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        personRestController = new PersonRestController(personFacade, objectMapper);
        this.mockMvc = MockMvcBuilders.standaloneSetup(personRestController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver(),
                        new QuerydslPredicateArgumentResolver(new QuerydslBindingsFactory(SimpleEntityPathResolver.INSTANCE), Optional.empty()))
                .setMessageConverters(new MappingJackson2HttpMessageConverter()).build();

        ObjectMapper obj = new ObjectMapper();
        obj.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        given(objectMapper.getSerializationConfig()).willReturn(obj.getSerializationConfig());

        personDto = new PersonDTO();
        personDto.setEmail("pavelseda@email.cz");
        personDto.setFirstName("Pavel");
        personDto.setNickname("SedaQ");
        personDto.setSurname("Seda");
    }

    @Test
    public void findPersonById() throws Exception {
        given(personFacade.findById(any(Long.class))).willReturn(personDto);
        String personValue = convertObjectToJsonBytes(personDto);
        given(objectMapper.writeValueAsString(any(Object.class))).willReturn(personValue);
        MockHttpServletResponse result = mockMvc.perform(get("/persons" + "/{id}", 1l))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn()
                .getResponse();
        assertEquals(convertObjectToJsonBytes(convertObjectToJsonBytes(personDto)), result.getContentAsString());
    }

    private static String convertObjectToJsonBytes(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
}
