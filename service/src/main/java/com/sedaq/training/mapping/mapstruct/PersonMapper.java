package com.sedaq.training.mapping.mapstruct;

import com.sedaq.training.api.dto.PersonDTO;
import com.sedaq.training.persistence.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person mapToEntity(PersonDTO personDTO);

    PersonDTO mapToDto(Person person);
}
