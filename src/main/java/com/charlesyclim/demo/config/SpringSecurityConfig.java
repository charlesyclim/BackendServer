package com.charlesyclim.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.httpBasic();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
        //configure "In Memory" Authentication
        .inMemoryAuthentication()
        
        /*
         * configure user "vendor"
         * with password "vendor"
         * and role "ROLE_VENDOR"
         */
        .withUser("vendor").password("vendor").roles("VENDOR").and()
        
        /*
         * configure user "customer"
         * with password "customer"
         * and role "ROLE_CUSTOMER"
         */
        .withUser("customer").password("customer").roles("CUSTOMER")
        ;
	}
}
