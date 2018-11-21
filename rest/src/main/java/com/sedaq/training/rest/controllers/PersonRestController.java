package com.sedaq.training.rest.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sedaq.training.facade.api.dto.meeting.MeetingDTO;
import com.sedaq.training.rest.utils.annotations.ApiPageableSwagger;
import io.swagger.annotations.*;
import org.jsondoc.core.annotation.ApiObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.bohnman.squiggly.Squiggly;
import com.github.bohnman.squiggly.util.SquigglyUtils;
import com.querydsl.core.types.Predicate;
import com.sedaq.training.facade.api.PageResultResource;
import com.sedaq.training.facade.api.dto.person.PersonDTO;
import com.sedaq.training.facade.exceptions.FacadeLayerException;
import com.sedaq.training.facade.iface.PersonFacade;
import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.rest.exceptions.ResourceNotFoundException;
import com.sedaq.training.rest.utils.HttpHeadersAcceptAndContentType;

import java.util.List;

/**
 * @author Pavel Šeda
 */
@Api(value = "/persons", consumes = "application/json or application/xml")
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
    @ApiOperation(httpMethod = "GET", value = "Get Person by Id.", response = PersonDTO.class, nickname = "findPersonById", produces = "application/json or application/xml")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "The requested resource was not found.")})
    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Object> findPersonById(
            @ApiParam(name = "Person Id")
            @PathVariable Long id,
            @ApiParam(value = "Fields which should be returned in REST API response", required = false)
            @RequestParam(value = "fields", required = false) String fields,
            @RequestHeader HttpHeaders headers) {
        try {
            PersonDTO userResource = personFacade.findById(id);
            if (HttpHeadersAcceptAndContentType.isJson(headers)) {
                Squiggly.init(objectMapper, fields);
                return new ResponseEntity<>(SquigglyUtils.stringify(objectMapper, userResource), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(userResource, HttpStatus.OK);
            }
        } catch (FacadeLayerException ex) {
            throw new ResourceNotFoundException(ex);
        }
    }

    /**
     * Get all Persons.
     *
     * @return all Persons.
     */
    @ApiOperation(httpMethod = "GET", value = "Get all persons.", response = PersonRestResource.class, responseContainer = "Page", nickname = "findAllPersons", produces = "application/json or application/xml")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "The requested resource was not found.")})
    @ApiPageableSwagger
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
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
            if (HttpHeadersAcceptAndContentType.isJson(headers)) {
                Squiggly.init(objectMapper, fields);
                return new ResponseEntity<>(SquigglyUtils.stringify(objectMapper, userResource), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(userResource, HttpStatus.OK);
            }
        } catch (FacadeLayerException ex) {
            throw new ResourceNotFoundException(ex);
        }
    }

    @ApiObject(name = "Result info (Page)",
            description = "Content (Retrieved data) and meta information about REST API result page. Including page number, number of elements in page, size of elements, total number of elements and total number of pages")
    private static class PersonRestResource extends PageResultResource<PersonDTO> {
        @JsonProperty(required = true)
        @ApiModelProperty(value = "Retrieved persons from databases.")
        private List<PersonDTO> content;
        @JsonProperty(required = true)
        @ApiModelProperty(value = "Pagination including: page number, number of elements in page, size, total elements and total pages.")
        private Pagination pagination;
    }


}
