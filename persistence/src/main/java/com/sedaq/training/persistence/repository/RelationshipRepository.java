package com.sedaq.training.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sedaq.training.persistence.model.Relationship;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface RelationshipRepository
		extends JpaRepository<Relationship, Long>, QuerydslPredicateExecutor<Relationship> {

}
