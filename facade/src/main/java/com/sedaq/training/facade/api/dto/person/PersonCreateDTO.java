package com.sedaq.training.facade.api.dto.person;

import java.time.LocalDate;
import java.util.Arrays;

import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.sedaq.training.facade.validation.annotations.ValidEmail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Pavel Šeda
 */
@ApiModel(value = "PersonCreateDTO", description = "Persons object to create in the database.")
public class PersonCreateDTO {

    @ApiModelProperty(value = "Person email.", example = "pavelseda@email.cz")
    @ValidEmail(message = "{personcreate.email.ValidEmail.message}")
    private String email;
    @JsonProperty(access = Access.WRITE_ONLY)
    private char[] pwd;
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

    public PersonCreateDTO(String email, char[] pwd, String nickname, String firstName, String surname,
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PersonCreateDTO [email=");
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
        builder.append("]");
        return builder.toString();
    }

}
