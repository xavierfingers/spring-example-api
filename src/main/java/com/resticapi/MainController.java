package com.resticapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
  @GetMapping("/")
   public String msg() {
    return "Spring is awesome!";
  }
   @GetMapping("/skibidi")
    public String skibidi() {
     return "Skibidi Toilet";
 }
}
