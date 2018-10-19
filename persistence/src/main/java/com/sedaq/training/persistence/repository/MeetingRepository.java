package com.sedaq.training.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sedaq.training.persistence.model.Meeting;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface MeetingRepository extends JpaRepository<Meeting, Long>, QuerydslPredicateExecutor<Meeting> {

}
