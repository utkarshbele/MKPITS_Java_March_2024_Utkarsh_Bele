package com.example.student_rest_api_22_08.security_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.awt.*;

@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails jane = User.builder()
                .username("jane")
                .password("{noop}123456")
                .roles("TEACHER")
                .build();
        UserDetails utkarsh = User.builder()
                .username("utkarsh")
                .password("{noop}123456")
                .roles("STUDENT")
                .build();
        return new InMemoryUserDetailsManager(jane, utkarsh);
    }

    @Bean
    public SecurityFilterChain configureFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(configure -> configure
                        .requestMatchers(HttpMethod.GET, "/main/students").hasAnyRole("STUDENT", "TEACHER")
                        .requestMatchers(HttpMethod.POST, "/main/students").hasRole("TEACHER")
                        .requestMatchers(HttpMethod.PUT, "/main/students/**").hasRole("TEACHER")
                        .requestMatchers(HttpMethod.DELETE, "/main/students/**").hasRole("TEACHER")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        http.csrf(csrf->csrf.disable());
        return http.build();
    }


}
