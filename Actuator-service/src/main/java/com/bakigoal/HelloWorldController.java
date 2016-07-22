package com.bakigoal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ilmir on 22.07.16.
 */
@RestController("/hello-world")
public class HelloWorldController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping
  public Greeting sayHello(@RequestParam(value = "name", required = false, defaultValue = "Actuator") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
}
