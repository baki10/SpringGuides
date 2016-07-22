package com.bakigoal;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * Created by ilmir on 22.07.16.
 */
@Service
public class GitHubLookupService {

  RestTemplate restTemplate = new RestTemplate();

  @Async
  public Future<User> findUser(String user) throws InterruptedException {
    System.out.println("Looking up " + user);
    User results = restTemplate.getForObject("https://api.github.com/users/" + user, User.class);
    // Artificial delay of 1s for demonstration purposes
    Thread.sleep(1000L);
    return new AsyncResult<>(results);
  }
}
