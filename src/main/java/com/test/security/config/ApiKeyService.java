package com.test.security.config;

import com.test.security.user.User;
import org.springframework.stereotype.Service;

@Service
public class ApiKeyService {

  public User findByEncodedApiKey(String encodedApiKey){
    if(encodedApiKey.equals("4f514d87cfb1a7d650637d65"))
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
