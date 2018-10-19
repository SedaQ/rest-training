package com.sedaq.training.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sedaq.training.persistence.model.RelationshipType;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface RelationshipTypeRepository
		extends JpaRepository<RelationshipType, Long>, QuerydslPredicateExecutor<RelationshipType> {

}
