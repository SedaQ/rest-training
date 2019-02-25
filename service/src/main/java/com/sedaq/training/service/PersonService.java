package com.sedaq.training.service;

import java.util.Optional;

import com.sedaq.training.exceptions.ServiceLayerException;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.persistence.repository.PersonRepository;

/**
 * @author Pavel Šeda
 */
@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Optional<Person> findById(Long id) {
        try {
            return personRepository.findById(id);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public Page<Person> findAll(Predicate predicate, Pageable pageable) {
        try {
            return personRepository.findAll(predicate, pageable);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void create(Person person) {
        try {
            personRepository.save(person);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void update(Person person) {
        try {
            personRepository.save(person);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void delete(Person person) {
        try {
            personRepository.delete(person);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    public void delete(Long id) {
        try {
            personRepository.deleteById(id);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

}
