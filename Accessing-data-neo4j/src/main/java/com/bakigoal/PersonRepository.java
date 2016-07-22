package com.bakigoal;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ilmir on 22.07.16.
 */
public interface PersonRepository extends CrudRepository<Person, String> {
  Person findByName(String name);

  List<Person> findByTeammatesName(String name);
}
