package com.sedaq.training.facade.api.dto.meeting;

import java.time.Duration;
import java.time.LocalDateTime;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author Pavel Šeda
 *
 */
@JacksonXmlRootElement(localName = "meeting")
@ApiModel(value = "MeetingDTO", description = "Information about meeting.")
public class MeetingDTO {

	@ApiModelProperty(value = "Meeting ID.")
	private Long idMeeting;
	@ApiModelProperty(value = "Meeting start time.")
	private LocalDateTime startTime;
	@ApiModelProperty(value = "Meeting duration.")
	private Duration duration;
	@ApiModelProperty(value = "Meeting place.")
	private String place;
	@ApiModelProperty(value = "Meeting note.")
	private String note;

	public MeetingDTO() {
		// used to inicialize mapping from entity
	}

	public Long getIdMeeting() {
		return idMeeting;
	}

	public void setIdMeeting(Long idMeeting) {
		this.idMeeting = idMeeting;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeetingDTO [idMeeting=");
		builder.append(idMeeting);
		builder.append(", startTime=");
		builder.append(startTime);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", place=");
		builder.append(place);
		builder.append(", note=");
		builder.append(note);
		builder.append("]");
		return builder.toString();
	}

}
