package com.walmart.configApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigApp {

	@Bean
	public Integer sampleInteger() {
		return Integer.valueOf("100");
	}

	/*
	 * Key points about springboot-security :-- 1. Incase of simple authentication
	 * just add the spring security dependency in the project . 2. For adding our
	 * choice of the username and the passwords setup the spring.security keys which
	 * will be automatically binded to the respective class using
	 * the @configurationProperties . 3. To include our choice of the endpoints
	 * configure the securityfilterchain and httpsecurity object . 4. For In-memory
	 * authentication configute the securityfilterchain and authentication-manager
	 * with the required username and passwords . 5. For setting our application to
	 * use the 3rd party authentication first add the oauth dependency in the
	 * project then configure the securityfilterchain object and with the form login
	 * use the oauth2Login also . 6. Setup the spring security keys also based upon
	 * the oauth login app (github,fb,gmail etc...) 7. Full control flow is
	 * explained in the .png file . 8. JWT - Json web tokenizer --> stateless
	 * authentication , in this servlet container will not create http-session
	 * object instead it will create a token and send it to the client using cookie
	 * . The benefit is our server will not be burdened with multiple session
	 * objects and we will improve memory and response time .
	 */

	@Bean
	public SecurityFilterChain customAuth(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests().requestMatchers("/api/v2/item/getAllItems").permitAll().anyRequest()
				.authenticated().and().formLogin().and().oauth2Login();
		return httpSecurity.build();
	}
}
