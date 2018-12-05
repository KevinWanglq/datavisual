package com.hyls.datavisual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatavisualApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatavisualApplication.class, args);
	}
	
	/*@Configuration
	public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests().anyRequest().permitAll()  
	            .and().csrf().disable();
	    }
	}*/
}


