package com.sedaq.training.service.iface;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.persistence.model.Person;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface PersonService {

	Optional<Person> findById(Long id);

	Page<Person> findAll(Predicate predicate, Pageable pageable);

	void create(Person person);

	void update(Person person);

	void delete(Person delete);

	void delete(Long id);

}
