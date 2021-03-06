package com.bakigoal;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ilmir on 22.07.16.
 */
@Component
public class SheduledTasks {

  private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

  @Scheduled(fixedRate = 5000)
  public void reportCurrentTime() {
    System.out.println("The time is: " + DATE_FORMAT.format(new Date()));
  }
}
