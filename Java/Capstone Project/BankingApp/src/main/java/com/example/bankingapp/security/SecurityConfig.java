package com.example.bankingapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        // Custom query to fetch user details
        jdbcUserDetailsManager.setUsersByUsernameQuery(
                "select email, password, enabled from users where email=?"
        );

        // Custom query to fetch user authorities/roles
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
                "select u.email as username, a.role_name as authority from users u " +
                        "join user_role ua on u.id=ua.user_id " +
                        "join role a on a.id=ua.role_id where u.email=?"
        );

        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain configureFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(configurer -> configurer
                        .requestMatchers("/signup/**", "/", "/login", "/css/**", "/js/**").permitAll() // Allow access to these paths
                        .anyRequest().authenticated() // Require authentication for all other requests
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/authenticateTheUser")
                        .defaultSuccessUrl("/home_page", true) // Redirect after successful login
                        .permitAll() // Allow all users to access the login page
                )
                .logout(logout -> logout.permitAll()) // Allow all users to log out
                .csrf(csrf -> csrf.disable())
                .exceptionHandling(configurer ->
                        configurer.accessDeniedPage("/access_denied") // Custom access denied page
                );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Use BCrypt for password encoding
    }
}
