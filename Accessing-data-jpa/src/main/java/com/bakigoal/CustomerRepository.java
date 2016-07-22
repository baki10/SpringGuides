package com.bakigoal;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ilmir on 22.07.16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);
}
