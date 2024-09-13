package com.example.spring_security_basic.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}password")
                .roles("USER")
                .build();
        UserDetails jane = User.builder()
                .username("jane")
                .password("{noop}password")
                .roles("MANAGER")
                .build();
        UserDetails utkarsh = User.builder()
                .username("utkarsh")
                .password("{noop}123456")
                .roles("ADMIN","MANAGER","USER")
                .build();
        return new InMemoryUserDetailsManager(john, jane, utkarsh);
    }

    @Bean
    public SecurityFilterChain configureFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(configurer -> configurer
                        .requestMatchers("resources/**", "/login", "/logout").permitAll()
                        .requestMatchers(HttpMethod.GET, "/admin/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/manager/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.GET, "/user/**").hasRole("USER")
                        .anyRequest().authenticated()
                )
                .formLogin(form->
                        form
                                .loginPage("/login")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll())
                .logout(logout -> logout.permitAll());
        http.httpBasic(Customizer.withDefaults());
        http.exceptionHandling(configurer ->
                configurer.accessDeniedPage("/access_denied")
        );
        return http.build();

    }
}