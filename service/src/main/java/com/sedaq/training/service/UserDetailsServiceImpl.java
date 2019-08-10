package com.sedaq.training.service;

import com.sedaq.training.annotations.transactions.TransactionalRO;
import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.persistence.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.nio.file.attribute.UserPrincipal;

@Service("proprietaryUserDetailsService")
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    private PersonRepository personRepository;

    @Autowired
    public UserDetailsServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    @TransactionalRO
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Person person = personRepository.findPersonByEmail(email);
        return new MyUserPrincipal(person);
    }
}
