package com.bakigoal;

/**
 * Created by ilmir on 26.07.16.
 */
public interface BookRepository {

  Book getByIsbn(String isbn);
}
