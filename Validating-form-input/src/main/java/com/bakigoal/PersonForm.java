package com.bakigoal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ilmir on 22.07.16.
 */
public class PersonForm {

  @Size(min = 2, max = 30)
  private String name;

  @NotNull
  @Min(18)
  private Integer age;

  @Override
  public String toString() {
    return "PersonForm{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
