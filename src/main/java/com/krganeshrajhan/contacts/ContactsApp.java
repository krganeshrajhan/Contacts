package com.krganeshrajhan.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.krganeshrajhan.contacts.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.krganeshrajhan.contacts"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class ContactsApp {

	public static void main(String[] args) {
		SpringApplication.run(ContactsApp.class, args);
	}
}
