package com.sedaq.training.facade.iface;

import org.springframework.data.domain.Pageable;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.facade.api.PageResultResource;
import com.sedaq.training.facade.api.dto.person.PersonCreateDTO;
import com.sedaq.training.facade.api.dto.person.PersonDTO;

/**
 * @author Pavel Šeda
 */
public interface PersonFacade {

    PersonDTO findById(Long id);

    PageResultResource<PersonDTO> findAll(Predicate predicate, Pageable pageable);

    PersonCreateDTO create(PersonCreateDTO person);

    PersonDTO update(PersonDTO person);

    void delete(PersonDTO person);

    void delete(Long id);

}
