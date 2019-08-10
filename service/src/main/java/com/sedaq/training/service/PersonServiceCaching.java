package com.sedaq.training.service;

import com.sedaq.training.exceptions.ServiceLayerException;
import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.persistence.repository.PersonRepository;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceCaching {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceCaching(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Cacheable(value = "persons", key = "#person.id")
    public Optional<Person> findById(Long id) {
        try {
            return personRepository.findById(id);
        } catch (HibernateException ex) {
            throw new ServiceLayerException(ex);
        }
    }

    @CachePut(value = "persons", key = "#person.idPerson", unless = "#result==null")
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @CacheEvict(value = "persons", key="#person.idPerson")
    public void deletePerson(Person person){
        personRepository.delete(person);
    }

    @Scheduled(cron = "0 0 0 * * *", zone = "UTC")
    @CacheEvict(value = "persons", allEntries = true)
    public void reloadPersons() {
    }

}
