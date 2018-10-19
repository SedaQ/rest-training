package com.sedaq.training.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sedaq.training.persistence.model.Person;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface PersonRepository extends JpaRepository<Person, Long>, QuerydslPredicateExecutor<Person> {

}
