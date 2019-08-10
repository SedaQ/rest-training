package com.sedaq.training.rest.controllers;

import com.sedaq.training.api.PageResultResource;
import com.sedaq.training.api.dto.PersonCreateDTO;
import com.sedaq.training.api.dto.PersonDTO;
import com.sedaq.training.exceptions.FacadeLayerException;
import com.sedaq.training.facade.PersonFacade;
import com.sedaq.training.rest.ApiErrorTraining;
import com.sedaq.training.rest.exceptions.ResourceNotCreatedException;
import com.sedaq.training.rest.utils.annotations.ApiPageableSwagger;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.bohnman.squiggly.Squiggly;
import com.github.bohnman.squiggly.util.SquigglyUtils;
import com.querydsl.core.types.Predicate;
import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.rest.exceptions.ResourceNotFoundException;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pavel Šeda
 */
@Api(value = "/persons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping(value = "/persons")
public class PersonRestController {

    private PersonFacade personFacade;
    private ObjectMapper objectMapper;

    @Autowired
    public PersonRestController(PersonFacade personFacade, ObjectMapper objectMapper) {
        this.personFacade = personFacade;
        this.objectMapper = objectMapper;
    }

    /**
     * Get requested Person by id.
     *
     * @param id of Person to return.
     * @return Requested Person by id.
     */
    @ApiOperation(
            httpMethod = "GET",
            value = "Get Person by Id.",
            response = PersonDTO.class,
            nickname = "findPersonById",
            produces = "application/json or application/xml"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "The requested resource was not found.")
    })
    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> findPersonById(
            @ApiParam(name = "Person Id")
            @PathVariable Long id,
            @ApiParam(value = "Fields which should be returned in REST API response", required = false)
            @RequestParam(value = "fields", required = false) String fields,
            @RequestHeader HttpHeaders headers) {
        try {
            PersonDTO userResource = personFacade.findById(id);
            Squiggly.init(objectMapper, fields);
            return new ResponseEntity<>(SquigglyUtils.stringify(objectMapper, userResource), HttpStatus.OK);
        } catch (FacadeLayerException ex) {
            throw new ResourceNotFoundException(ex);
        }
    }

    /**
     * Get all Persons.
     *
     * @return all Persons.
     */
    @ApiOperation(
            httpMethod = "GET",
            value = "Get All Persons.",
            response = PersonDTO.class,
            responseContainer = "Page",
            nickname = "findAllPersons",
            produces = "application/json or application/xml"
    )
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "The requested resource was not found.")
    })
    @ApiPageableSwagger
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> findAllPersons(
            @QuerydslPredicate(root = Person.class) Predicate predicate,
            Pageable pageable,
            @ApiParam(value = "Parameters for QueryDSL filtering", required = false)
            @RequestParam MultiValueMap<String, String> parameters,
            @ApiParam(value = "Fields which should be returned in REST API response", required = false)
            @RequestParam(value = "fields", required = false) String fields,
            @RequestHeader HttpHeaders headers) {
        try {
            PageResultResource<PersonDTO> userResource = personFacade.findAll(predicate, pageable);
            Squiggly.init(objectMapper, fields);
            return new ResponseEntity<>(SquigglyUtils.stringify(objectMapper, userResource), HttpStatus.OK);
        } catch (FacadeLayerException ex) {
            throw new ResourceNotFoundException(ex);
        }
    }

    @ApiOperation(
            httpMethod = "POST",
            value = "Create Person",
            response = PersonCreateDTO.class,
            nickname = "createPerson",
            produces = "application/json"
    )
    @ExceptionHandler
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonCreateDTO> createPerson(
            @ApiParam(value = "Person to be created")
            @RequestBody @Valid PersonCreateDTO personCreateDTO) {
        try {
            PersonCreateDTO person = personFacade.create(personCreateDTO);
            return ResponseEntity.ok(person);
        } catch (FacadeLayerException ex) {
            throw new ResourceNotCreatedException(ex);
        }
    }
}
