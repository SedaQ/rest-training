package com.sedaq.training.persistence.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Pavel Šeda
 */
@Entity
@Table(name = "address")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_address", updatable = false, nullable = false)
    private Long id;
    @Column(nullable = false, length = 45)
    private String city;
    @Column(nullable = false, length = 45)
    private String street;
    @Column(name = "house_number", nullable = false)
    private Integer houseNumber;
    @Column(name = "zip_code", nullable = true, length = 45)
    private String zipCode;
    @OneToMany(targetEntity = Person.class, mappedBy = "address")
    private Set<Person> persons = new HashSet<>();

    public Address() {
        //hibernate requires non-args constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Set<Person> getPersons() {
        return Collections.unmodifiableSet(persons);
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, houseNumber, street, persons);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Address))
            return false;
        Address other = (Address) obj;
        return Objects.equals(city, other.getCity()) && houseNumber == other.getHouseNumber()
                && Objects.equals(street, other.getStreet()) && Objects.equals(persons, other.getPersons());
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
