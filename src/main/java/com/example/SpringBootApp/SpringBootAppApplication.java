package com.example.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {

		System.setProperty("java.security.krb5.kdc", "kdc1.example.com");
		System.setProperty("java.security.krb5.realm", "EXAMPLE.COM");

		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
