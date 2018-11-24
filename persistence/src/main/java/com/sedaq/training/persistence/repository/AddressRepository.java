package com.sedaq.training.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sedaq.training.persistence.model.Address;
import org.springframework.stereotype.Repository;

/**
 * @author Pavel Šeda
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>, QuerydslPredicateExecutor<Address> {

}
