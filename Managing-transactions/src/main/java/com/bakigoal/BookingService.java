package com.bakigoal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ilmir on 22.07.16.
 */
public class BookingService {
  private final static Logger log = LoggerFactory.getLogger(BookingService.class);

  @Autowired
  JdbcTemplate jdbcTemplate;

  @Transactional
  public void book(String... persons) {
    for (String person : persons) {
      log.info("Booking " + person + " in a seat...");
      jdbcTemplate.update("insert into BOOKINGS(FIRST_NAME) values (?)", person);
    }
  }

  ;

  public List<String> findAllBookings() {
    return jdbcTemplate.query("select FIRST_NAME from BOOKINGS", (rs, rowNum) -> {
      return rs.getString("FIRST_NAME");
    });
  }
}
