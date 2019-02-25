package com.sedaq.training.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Pavel Šeda
 */
@ApiModel(value = "MeetingCreateDTO", description = "Meeting object to create in the database.")
public class MeetingCreateDTO {

    @ApiModelProperty(value = "Start time of the meeting.", example = "2018-11-21T22:51:03.303998800")
    @NotNull(message = "{meetingcreate.startTime.NotNull.message}")
    @Future(message = "{meetingcreate.startTime.Future.message}")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "Place of the meeting.", example = "Brno at Svobodak")
    @NotEmpty(message = "{meetingcreate.place.NotEmpty.message}")
    private String place;
    @ApiModelProperty(value = "Note about meeting.", example = "Be late is not accessible!.")
    private String note;
    @ApiModelProperty(value = "Duration of meeting.", example = "PT30M")
    @NotNull(message = "{meetingcreate.duration.NotNull.message}")
    private Duration duration;

    public MeetingCreateDTO(
            @NotNull(message = "{meetingcreate.startTime.NotNull.message}") @Future(message = "{meetingcreate.startTime.Future.message}") LocalDateTime startTime,
            @NotEmpty(message = "{meetingcreate.place.NotEmpty.message}") String place,
            @NotNull(message = "{meetingcreate.duration.NotNull.message}") Duration duration) {
        this.startTime = startTime;
        this.place = place;
        this.duration = duration;
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
        builder.append("MeetingCreateDTO [startTime=");
        builder.append(startTime);
        builder.append(", place=");
        builder.append(place);
        builder.append(", note=");
        builder.append(note);
        builder.append(", duration=");
        builder.append(duration);
        builder.append("]");
        return builder.toString();
    }

}
