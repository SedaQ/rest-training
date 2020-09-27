package com.sedaq.training.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.sedaq.training.api.validation.annotations.ValidEmail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * @author Pavel Šeda
 */
@ApiModel(value = "PersonCreateDTO", description = "Persons object to create in the database.")
public class PersonCreateDTO {

    @ApiModelProperty(value = "Person email.", example = "pavelseda@email.cz")
    @ValidEmail(message = "{personcreate.email.ValidEmail.message}")
    private String email;
    @JsonProperty(access = Access.WRITE_ONLY)
    private String pwd;
    @ApiModelProperty(value = "Person nickname.", example = "SedaQ")
    private String nickname;
    @ApiModelProperty(value = "Person first name.", example = "Pavel")
    private String firstName;
    @ApiModelProperty(value = "Person surname.", example = "Seda")
    private String surname;
    @ApiModelProperty(value = "Person birthday.", example = "2018-11-21")
    @Past(message = "{personcreate.birthday.Past.message}")
    private LocalDate birthday;
    @ApiModelProperty(value = "Person age.")
    private Integer age;

    public PersonCreateDTO() {
    }

    public PersonCreateDTO(String email, String pwd, String nickname, String firstName, String surname,
                           @Past(message = "{personcreate.birthday.Past.message}") LocalDate birthday, Integer age) {
        super();
        this.email = email;
        this.pwd = pwd;
        this.nickname = nickname;
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = birthday;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
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

    @Override
    public String toString() {
        return "PersonCreateDTO{" +
                "email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }
}
