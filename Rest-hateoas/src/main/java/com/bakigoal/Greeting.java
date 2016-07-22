package com.bakigoal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by ilmir on 21.07.16.
 */
public class Greeting extends ResourceSupport {

  private final String content;

  @JsonCreator
  public Greeting(@JsonProperty("content") String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
