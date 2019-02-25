package com.sedaq.training.facade;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.api.PageResultResource;
import com.sedaq.training.api.dto.PersonCreateDTO;
import com.sedaq.training.api.dto.PersonDTO;
import com.sedaq.training.persistence.model.Person;
import com.sedaq.training.annotations.transactions.TransactionalRO;
import com.sedaq.training.annotations.transactions.TransactionalWO;
import com.sedaq.training.exceptions.FacadeLayerException;
import com.sedaq.training.exceptions.ServiceLayerException;
import com.sedaq.training.service.PersonService;
import com.sedaq.training.mapping.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Pavel Šeda
 */
@Service
@Transactional
public class PersonFacade {

    private PersonService personService;
    private BeanMapping beanMapping;

    @Autowired
    public PersonFacade(PersonService personService, BeanMapping beanMapping) {
        this.personService = personService;
        this.beanMapping = beanMapping;
    }

    @TransactionalRO
    public PersonDTO findById(Long id) {
        try {
            Optional<Person> userOpt = personService.findById(id);
            Person user = userOpt.orElseThrow(() -> new ServiceLayerException("Person with this id is not found"));
            return beanMapping.mapTo(user, PersonDTO.class);
        } catch (NullPointerException ex) {
            throw new FacadeLayerException("Given Person ID is null.");
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalRO
    public PageResultResource<PersonDTO> findAll(Predicate predicate, Pageable pageable) {
        try {
            return beanMapping.mapToPageResource(personService.findAll(predicate, pageable), PersonDTO.class);
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public PersonCreateDTO create(PersonCreateDTO personDTO) {
        try {
            personService.create(beanMapping.mapTo(personDTO, Person.class));
            return personDTO;
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public PersonDTO update(PersonDTO personDTO) {
        try {
            personService.update(beanMapping.mapTo(personDTO, Person.class));
            return personDTO;
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public void delete(PersonDTO personDTO) {
        try {
            personService.delete(beanMapping.mapTo(personDTO, Person.class));
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

    @TransactionalWO
    public void delete(Long id) {
        try {
            personService.delete(id);
        } catch (ServiceLayerException ex) {
            throw new FacadeLayerException(ex);
        }
    }

}
