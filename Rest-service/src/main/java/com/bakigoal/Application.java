package com.bakigoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ilmir on 21.07.16.
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}