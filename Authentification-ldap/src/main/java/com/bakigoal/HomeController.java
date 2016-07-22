package com.bakigoal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ilmir on 22.07.16.
 */
@RestController
public class HomeController {

  @RequestMapping("/")
  public String index(){
    return "Welcome to the home page!";
  }
}
