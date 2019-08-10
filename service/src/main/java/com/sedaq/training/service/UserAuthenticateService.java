package com.sedaq.training.service;

import com.sedaq.training.api.dto.PersonAuthDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author Pavel Seda
 */
@Service
public class UserAuthenticateService {

    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserAuthenticateService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public boolean authenticate(PersonAuthDto personAuthDto, UserDetails userDetails) {
        System.out.println("Authenticate...... " + passwordEncoder.matches(personAuthDto.getPassword(), userDetails.getPassword()));
        return passwordEncoder.matches(personAuthDto.getPassword(), userDetails.getPassword());
    }
}
