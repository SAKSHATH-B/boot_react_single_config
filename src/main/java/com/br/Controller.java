package com.br;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/getmapp")
  public String name() {
    return "Helmlock";
  }
}
