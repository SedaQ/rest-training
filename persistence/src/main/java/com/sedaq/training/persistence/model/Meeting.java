package com.sedaq.training.persistence.model;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Pavel Šeda
 */
@Entity
@Table(name = "meeting")
public class Meeting implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_meeting", updatable = false, nullable = false)
    private Long id;
    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;
    @Column(name = "duration", nullable = false)
    private Duration duration;
    @Column(nullable = false, length = 200)
    private String place;
    @Column(nullable = true, length = 1000)
    private String note;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "person_has_meeting", joinColumns = {@JoinColumn(name = "id_person")}, inverseJoinColumns = {
            @JoinColumn(name = "id_meeting")})
    private Set<Person> persons = new HashSet<>();

    public Meeting() {
        // hibernate requires non-args constructor
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

    public Set<Person> getPersons() {
        return Collections.unmodifiableSet(persons);
    }

    public void setPersons(Set<Person> persons) {
        this.persons = new HashSet<>(persons);
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", duration=" + duration +
                ", place='" + place + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
