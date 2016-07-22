package com.bakigoal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ilmir on 22.07.16.
 */
@JsonIgnoreProperties(ignoreUnknown = true) //any properties not bound in this type should be ignored
public class Quote {
  private String type;
  private Value value;

  public Quote() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Value getValue() {
    return value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Quote{" +
        "type='" + type + '\'' +
        ", value=" + value +
        '}';
  }
}
