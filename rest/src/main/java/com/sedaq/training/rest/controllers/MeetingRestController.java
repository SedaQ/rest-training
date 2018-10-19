package com.sedaq.training.rest.controllers;

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
import com.sedaq.training.facade.api.PageResultResource;
import com.sedaq.training.facade.api.dto.meeting.MeetingDTO;
import com.sedaq.training.facade.exceptions.FacadeLayerException;
import com.sedaq.training.facade.iface.MeetingFacade;
import com.sedaq.training.persistence.model.Meeting;
import com.sedaq.training.rest.exceptions.ResourceNotFoundException;
import com.sedaq.training.rest.utils.HttpHeadersAcceptAndContentType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

/**
 * @author Pavel Šeda
 *
 */
//@formatter:off
@Api(value = "/meetings", consumes = "application/json or application/xml")
//@formatter:on
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
	// @formatter:off
	@ApiOperation(httpMethod = "GET", value = "Get Meeting by Id.", response = MeetingDTO.class, nickname = "findUserById", produces = "application/json or application/xml", authorizations = {
			@Authorization(value = "sampleoauth", scopes = {
					@AuthorizationScope(scope = "find Meeting by ID", description = "allows returning Meeting by ID.") }) })
	@ApiResponses(value = { @ApiResponse(code = 404, message = "The requested resource was not found.") })
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> findMeetingById(@ApiParam(name = "Meeting Id") @PathVariable Long id,
			@ApiParam(value = "Fields which should be returned in REST API response", required = false) @RequestParam(value = "fields", required = false) String fields,
			@RequestHeader HttpHeaders headers) {
		try {
			MeetingDTO meetingResource = meetingFacade.findById(id);
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
	// @formatter:on

	/**
	 * Get all Meetings.
	 * 
	 * @return all Meetings.
	 */
	// @formatter:off
	@ApiOperation(httpMethod = "GET", value = "Get All Meetings.", response = MeetingDTO.class, responseContainer = "Page", nickname = "findAllMeetings", produces = "application/json or application/xml", authorizations = {
			@Authorization(value = "sampleoauth", scopes = {
					@AuthorizationScope(scope = "find all Meetings", description = "allows returning Meetings.") }) })
	@ApiResponses(value = { @ApiResponse(code = 404, message = "The requested resource was not found.") })
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> findAllMeetings(@QuerydslPredicate(root = Meeting.class) Predicate predicate,
			Pageable pageable, @RequestParam MultiValueMap<String, String> parameters,
			@ApiParam(value = "Fields which should be returned in REST API response", required = false) @RequestParam(value = "fields", required = false) String fields,
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
	// @formatter:on

}
