package com.bakigoal;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

/**
 * Created by ilmir on 22.07.16.
 */
public class Application {
  public static void main(String[] args) throws IOException, InterruptedException {
    ConfigurableApplicationContext ctx = new SpringApplication("/config/integration.xml").run(args);
    Thread.sleep(15000);
    ctx.close();
  }
}
