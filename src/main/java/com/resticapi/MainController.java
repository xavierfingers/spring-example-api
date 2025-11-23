package com.resticapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.Frame;
@RestController
public class MainController {
  @GetMapping("/")
   public String msg() {
     return "<em>Hello Spring</em>";
  }
   @GetMapping("/skibidi")
    public String skibidi() {
     return "Skibidi Toilet";
 }
}
