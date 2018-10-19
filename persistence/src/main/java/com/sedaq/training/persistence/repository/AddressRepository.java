package com.sedaq.training.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sedaq.training.persistence.model.Address;

/**
 * 
 * @author Pavel Šeda
 *
 */
public interface AddressRepository extends JpaRepository<Address, Long>, QuerydslPredicateExecutor<Address> {

}
