package com.config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity//(debug = true)
public class DefaultSecurityConfig
{
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception 
	{
	    http
	    .csrf().disable()
	    .authorizeRequests()
	    .antMatchers(
    		"/v3/api-docs/**",
			"/swagger-ui/**",
			"/swagger-ui.html",
			"/*.html",
			"/**/*.html",
			"/**/*.css",
			"/**/*.js",
			"/**/*.png",
			"/favicon.ico",
			"/error")
	    .permitAll()
	    .anyRequest().authenticated()
	    .and()
	    .httpBasic()
	    ;
	    return http.build();
	}
}
