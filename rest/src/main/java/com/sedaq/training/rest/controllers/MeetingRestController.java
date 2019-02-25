package com.sedaq.training.rest.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sedaq.training.api.PageResultResource;
import com.sedaq.training.api.dto.MeetingDTO;
import com.sedaq.training.exceptions.FacadeLayerException;
import com.sedaq.training.facade.MeetingFacade;
import com.sedaq.training.rest.utils.annotations.ApiPageableSwagger;
import io.swagger.annotations.*;
import org.jsondoc.core.annotation.ApiObject;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.sedaq.training.persistence.model.Meeting;
import com.sedaq.training.rest.exceptions.ResourceNotFoundException;
import com.sedaq.training.rest.utils.HttpHeadersAcceptAndContentType;

import java.util.List;

/**
 * @author Pavel Šeda
 */
@Api(value = "/meetings", consumes = "application/json or application/xml")
@RestController
@RequestMapping(value = "/meetings")
public class MeetingRestController {

    private MeetingFacade meetingFacade;
    private ObjectMapper objectMapper;

    @Autowired
    public MeetingRestController(MeetingFacade meetingFacade, ObjectMapper objectMapper) {
        this.meetingFacade = meetingFacade;
        this.objectMapper = objectMapper;
    }

    /**
     * Get requested Meeting by id.
     *
     * @param id of Meeting to return.
     * @return Requested Meeting by id.
     */
    @ApiOperation(httpMethod = "GET", value = "Get Meeting by Id.", response = MeetingDTO.class, nickname = "findMeetingById", produces = "application/json or application/xml")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "The requested resource was not found.")})
    @GetMapping(path = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> findMeetingById(
            @ApiParam(name = "Meeting Id")
            @PathVariable Long id,
            @ApiParam(value = "Fields which should be returned in REST API response", required = false)
            @RequestParam(value = "fields", required = false) String fields,
            @RequestHeader HttpHeaders headers) {
        try {
            MeetingDTO meetingResource = meetingFacade.findById(id);
            Squiggly.init(objectMapper, fields);
            return new ResponseEntity<>(SquigglyUtils.stringify(objectMapper, meetingResource), HttpStatus.OK);
        } catch (FacadeLayerException ex) {
            throw new ResourceNotFoundException(ex);
        }
    }

    /**
     * Get all Meetings.
     *
     * @return all Meetings.
     */
    @ApiOperation(httpMethod = "GET", value = "Get All Meetings.", response = MeetingRestResource.class, responseContainer = "Page", nickname = "findAllMeetings", produces = "application/json or application/xml")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "The requested resource was not found.")})
    @ApiPageableSwagger
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> findAllMeetings(
            @QuerydslPredicate(root = Meeting.class) Predicate predicate,
            Pageable pageable,
            @ApiParam(value = "Parameters for QueryDSL filtering", required = false)
            @RequestParam MultiValueMap<String, String> parameters,
            @ApiParam(value = "Fields which should be returned in REST API response", required = false)
            @RequestParam(value = "fields", required = false) String fields,
            @RequestHeader HttpHeaders headers) {
        try {
            PageResultResource<MeetingDTO> meetingResource = meetingFacade.findAll(predicate, pageable);
            if (HttpHeadersAcceptAndContentType.isJson(headers)) {
                Squiggly.init(objectMapper, fields);
                return new ResponseEntity<>(SquigglyUtils.stringify(objectMapper, meetingResource), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(meetingResource, HttpStatus.OK);
            }
        } catch (FacadeLayerException ex) {
            throw new ResourceNotFoundException(ex);
        }
    }

    @ApiObject(name = "Result info (Page)",
            description = "Content (Retrieved data) and meta information about REST API result page. Including page number, number of elements in page, size of elements, total number of elements and total number of pages")
    private static class MeetingRestResource extends PageResultResource<MeetingDTO> {
        @JsonProperty(required = true)
        @ApiModelProperty(value = "Retrieved meetings from databases.")
        private List<MeetingDTO> content;
        @JsonProperty(required = true)
        @ApiModelProperty(value = "Pagination including: page number, number of elements in page, size, total elements and total pages.")
        private Pagination pagination;
    }


}
