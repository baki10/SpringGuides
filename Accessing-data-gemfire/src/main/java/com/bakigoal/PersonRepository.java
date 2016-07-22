package com.bakigoal;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ilmir on 22.07.16.
 */
public interface PersonRepository extends CrudRepository<Person, String> {

  Person findByName(String name);

  Iterable<Person> findByAgeGreaterThan(int age);

  Iterable<Person> findByAgeLessThan(int age);

  Iterable<Person> findByAgeGreaterThanAndAgeLessThan(int ageMin, int ageMax);
}
