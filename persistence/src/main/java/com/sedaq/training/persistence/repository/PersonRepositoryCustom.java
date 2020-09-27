package com.sedaq.training.persistence.repository;

import com.sedaq.training.persistence.model.Person;

public interface PersonRepositoryCustom {

    Person findPersonByIdWithAddress(Long id);
}
