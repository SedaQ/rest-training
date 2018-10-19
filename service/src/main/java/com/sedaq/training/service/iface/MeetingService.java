package com.sedaq.training.service.iface;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.querydsl.core.types.Predicate;
import com.sedaq.training.persistence.model.Meeting;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface MeetingService {

	Optional<Meeting> findById(Long id);

	Page<Meeting> findAll(Predicate predicate, Pageable pageable);

	void create(Meeting meeting);

	void update(Meeting meeting);

	void delete(Meeting delete);

	void delete(Long id);

}
