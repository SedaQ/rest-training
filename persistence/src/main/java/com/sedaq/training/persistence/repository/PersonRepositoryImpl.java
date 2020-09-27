package com.sedaq.training.persistence.repository;

import com.sedaq.training.persistence.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class PersonRepositoryImpl implements PersonRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Person findPersonByIdWithAddress(Long id) {
        TypedQuery<Person> query = entityManager.createQuery("SELECT p FROM Person p JOIN FETCH p.address a WHERE p.id = :id", Person.class);
        return query.setParameter("id", id).getSingleResult();
    }
}
