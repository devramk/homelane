package com.fifa.dreamteam.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
  @GetMapping(value = "/world")
  public Map<String, String> helloWorld() {
    Map<String, String> response = new HashMap<>();
    response.put("hello", "world");
    return response;
  }
}
