package com.sedaq.training.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Pavel Šeda
 */
//@JacksonXmlRootElement(localName = "meeting")
@ApiModel(value = "MeetingDTO", description = "Information about meeting.")
public class MeetingDTO {

    @ApiModelProperty(value = "Meeting ID.", example = "1")
    private Long id;
    @ApiModelProperty(value = "Meeting start time.", example = "2018-11-21T22:51:03.303998800")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "Meeting duration.", example = "PT30M")
    private Duration duration;
    @ApiModelProperty(value = "Meeting place.", example = "Brno at Svobodak")
    private String place;
    @ApiModelProperty(value = "Meeting note.", example = "Be late is not accessible!.")
    private String note;

    public MeetingDTO() {
        // used to inicialize mapping from entity
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        builder.append("MeetingDTO [id=");
        builder.append(id);
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
