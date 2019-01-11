package com.example.springboothello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World!";
  }

  @GetMapping("/another")
  public String another() {
    return "Another World!";
  }

}
