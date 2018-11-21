package com.sedaq.training.facade.mapping;

import org.springframework.data.domain.Page;

import com.sedaq.training.facade.api.PageResultResource;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * That class is used for mapping entities to DTO classes. Example of usage for
 * this mapper shown below:
 *
 * <pre>
 * <code>
 * public class PersonFacadeImpl implements PersonFacade {
 *
 * &#64;Autowired
 * private BeanMapping beanMapping;
 * &#64;Autowired
 * private PersonService personService;
 *
 * &#64;Override
 * public Person&lt;UserDTO&gt; getAllPersons() {
 * return beanMapping.mapTo(personService.findAll(), PersonDTO.class);
 * }
 * }
 * </code>
 * </pre>
 * <p>
 * This example shows mapping list of person entities to list of person DTO
 * classes.
 *
 * @author Pavel Šeda
 */
public interface BeanMapping {

    <T> List<T> mapTo(Collection<?> objects, Class<T> mapToClass);

    <T> Page<T> mapTo(Page<?> objects, Class<T> mapToClass);

    <T> PageResultResource<T> mapToPageResource(Page<?> objects, Class<T> mapToClass);

    <T> Set<T> mapToSet(Collection<?> objects, Class<T> mapToClass);

    <T> Optional<T> mapToOptional(Object u, Class<T> mapToClass);

    <T> T mapTo(Object u, Class<T> mapToClass);

}
