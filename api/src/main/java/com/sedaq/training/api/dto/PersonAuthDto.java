package com.sedaq.training.api.dto;

/**
 * @author Pavel Seda
 */
public class PersonAuthDto {

    private String email;
    private String password;

    public PersonAuthDto(){}

    public PersonAuthDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PersonAuthDto{" +
                ", email='" + email + '\'' +
                '}';
    }
}
