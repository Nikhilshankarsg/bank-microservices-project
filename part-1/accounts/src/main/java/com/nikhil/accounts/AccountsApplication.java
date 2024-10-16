package com.nikhil.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Account Microservices for API Documentation",
				description = "Bank Accounts Microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "nikhil",
						email = "nikhilshankarsg@gmail.com",
						url = "https://www.nikhil.com"
				),
				license = @License(
						name = "Apache-Tomcat 2.0",
						url = "https://www.nikhilc.com"
				)
			),
		    externalDocs = @ExternalDocumentation(
						description = "Bank Accounts Microservice REST API Documentation",
						url = "https://www.nikhilc.com"
				)
			)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
