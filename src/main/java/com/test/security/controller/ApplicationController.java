package com.test.security.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
@Hidden
public class ApplicationController {

  @Autowired
  private PasswordEncoder passwordEncoder;

  @GetMapping("/healthcheck")
  public ResponseEntity<String> healthcheck() {
    return ResponseEntity.ok("ok");
  }

  @GetMapping("/encode")
  public ResponseEntity<Map<String,String>> encode(String key) {
    return ResponseEntity.ok(Map.of("encodedKey", passwordEncoder.encode(key)));
  }

}
