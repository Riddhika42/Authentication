package com.substring.auth.auth_app_backend.config;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {



//
//    @Bean
//    public UserDetailsService users() {
//
//        UserDetails user1 = User.builder()
//                .username("riddhika")
//                .password(passwordEncoder().encode("abc"))
//                .roles("ADMIN")
//                .build();
//
//        UserDetails user2 = User.builder()
//                .username("jyotirmoy")
//                .password(passwordEncoder().encode("xyz"))
//                .roles("ADMIN")
//                .build();
//
//        UserDetails user3 = User.builder()
//                .username("barna")
//                .password(passwordEncoder().encode("123"))
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user1, user2, user3);
//    }
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {



        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/v1/auth/register").permitAll() // IMPORTANT
                        .anyRequest().authenticated()
                );

        return http.build();





}

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}