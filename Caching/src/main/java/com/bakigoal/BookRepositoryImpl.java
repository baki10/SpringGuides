package com.bakigoal;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * Created by ilmir on 26.07.16.
 */
@Repository
public class BookRepositoryImpl implements BookRepository {

  @Override
  @Cacheable("books")
  public Book getByIsbn(String isbn) {
    simulateSlowService(5000L);
    return new Book(isbn, "Some book");
  }

  // Don't do this at home
  private void simulateSlowService(long time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
  }
}
