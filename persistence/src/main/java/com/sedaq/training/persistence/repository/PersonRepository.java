package com.sedaq.training.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sedaq.training.persistence.model.Person;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

/**
 * @author Pavel Šeda
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>, QuerydslPredicateExecutor<Person> {

    @Query("SELECT p FROM Person p WHERE p.email = :email")
    Person findPersonByEmail(@Param("email") String email);
}
