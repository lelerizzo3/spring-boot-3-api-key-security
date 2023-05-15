package com.test.security.config;

import com.test.security.user.User;
import org.springframework.stereotype.Service;

@Service
public class ApiKeyService {

  public User findByApiKey(String apiKey){
    if(apiKey.equals("123"))
      return User.builder()
              .firstname("lele")
              .lastname("rizzo")
              .email("lele@mail.com")
              .apiKey("123")
              .roles(new String[] {"ABC","DEF"})
              .build();
    else
      throw new RuntimeException("api key not valid");
  }
}
