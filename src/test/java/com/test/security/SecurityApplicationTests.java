package com.test.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@SpringBootTest
class SecurityApplicationTests {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Test
	void contextLoads() {
	}

	@Test
	void encode() {
		String key = "123";
		PasswordEncoder encoder = new Pbkdf2PasswordEncoder("test",0,10,100);
//		PasswordEncoder encoder = new BCryptPasswordEncoder(-1);
		System.out.println(encoder.encode(key));
		System.out.println(encoder.encode(key));
		System.out.println(encoder.encode(key));
	}

}
