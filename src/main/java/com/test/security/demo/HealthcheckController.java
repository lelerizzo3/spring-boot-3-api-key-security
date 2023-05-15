package com.test.security.demo;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
@Hidden
public class HealthcheckController {

  @GetMapping
  public ResponseEntity<String> healthcheck() {
    return ResponseEntity.ok("ok");
  }

}
