package com.bakigoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ilmir on 21.07.16.
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  /*
  using terminal:

  $ curl localhost:8080/hello-world
  curl: (52) Empty reply from server

  $ curl localhost:9000/hello-world
  {"id":1,"content":"Hello, Stranger!"}

  $ curl localhost:9001/health
  {"status":"UP"}
  * */
}