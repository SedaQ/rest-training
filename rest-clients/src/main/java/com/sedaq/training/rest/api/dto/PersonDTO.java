package com.sedaq.training.rest.api.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Pavel Seda
 */
@XmlRootElement
public class PersonDTO {

    private Long idPerson;
    private String email;
    private String nickname;
    private String firstName;
    private String surname;
    private LocalDate birthday;
    private Integer age;

    public PersonDTO() {
        // used to inicialize mapping from entity
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

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof PersonDTO))
            return false;
        PersonDTO other = (PersonDTO) obj;
        return Objects.equals(email, other.getEmail());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PersonDTO [idPerson=");
        builder.append(idPerson);
        builder.append(", email=");
        builder.append(email);
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
        builder.append("]");
        return builder.toString();
    }

}
