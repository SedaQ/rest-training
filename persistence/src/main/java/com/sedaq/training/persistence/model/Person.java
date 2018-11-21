package com.sedaq.training.persistence.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

/**
 * @author Pavel Šeda
 */
@Entity
@Table(name = "\"person\"")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person", updatable = false, nullable = false)
    private Long idPerson;
    @NaturalId
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false)
    private char[] pwd;
    @Column(nullable = false, length = 45)
    private String nickname;
    @Column(nullable = false, length = 45)
    private String firstName;
    @Column(nullable = false, length = 45)
    private String surname;
    @Column(nullable = true)
    private LocalDate birthday;
    @Column(nullable = true)
    private Integer age;
    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Meeting.class, mappedBy = "persons")
    private Set<Meeting> meetings = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_address")
    private Address address;
    @OneToMany(targetEntity = Contact.class, mappedBy = "person")
    private Set<Contact> contacts = new HashSet<>();
    @OneToMany(targetEntity = Relationship.class, mappedBy = "person1")
    private Set<Person> persons1 = new HashSet<>();
    @OneToMany(targetEntity = Relationship.class, mappedBy = "person2")
    private Set<Person> persons2 = new HashSet<>();

    public Person() {
        // hibernate requires non-args constructor
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getPwd() {
        return pwd;
    }

    public void setPwd(char[] pwd) {
        this.pwd = pwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Meeting> getMeetings() {
        return Collections.unmodifiableSet(meetings);
    }

    public void setMeetings(Set<Meeting> meetings) {
        this.meetings = new HashSet<>(meetings);
    }

    public void addMeeting(Meeting meeting) {
        this.meetings.add(meeting);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Contact> getContacts() {
        return Collections.unmodifiableSet(contacts);
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = new HashSet<>(contacts);
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public Set<Person> getPersons1() {
        return Collections.unmodifiableSet(persons1);
    }

    public void setPersons1(Set<Person> persons1) {
        this.persons1 = persons1;
    }

    public Set<Person> getPersons2() {
        return Collections.unmodifiableSet(persons2);
    }

    public void setPersons2(Set<Person> persons2) {
        this.persons2 = new HashSet<>(persons2);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Person))
            return false;
        Person other = (Person) obj;
        return Objects.equals(email, other.getEmail());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [idPerson=");
        builder.append(idPerson);
        builder.append(", email=");
        builder.append(email);
        builder.append(", pwd=");
        builder.append(Arrays.toString(pwd));
        builder.append(", nickname=");
        builder.append(nickname);
        builder.append(", firstName=");
        builder.append(firstName);
        builder.append(", surname=");
        builder.append(surname);
        builder.append(", birthday=");
        builder.append(birthday);
        builder.append(", age=");
        builder.append(age);
        builder.append(", meetings=");
        builder.append(meetings);
        builder.append(", address=");
        builder.append(address);
        builder.append(", contacts=");
        builder.append(contacts);
        builder.append(", persons1=");
        builder.append(persons1);
        builder.append(", persons2=");
        builder.append(persons2);
        builder.append("]");
        return builder.toString();
    }

}
