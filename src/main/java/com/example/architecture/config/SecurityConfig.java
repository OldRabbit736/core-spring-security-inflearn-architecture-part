package com.example.architecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    /**
     * 첫번째 SecurityFilterChain *
     */
    @Bean
    SecurityFilterChain chain1(HttpSecurity http) throws Exception {
        http
                .antMatcher("/admin/**")
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();

        return http.build();
    }

    /**
     * 두번째 SecurityFilterChain *
     */
    @Bean
    SecurityFilterChain chain2(HttpSecurity http) throws Exception {
        // 모든 url 패턴에 대해서 matching 된다. antMatcher 를 설정하지 않았기 때문이다.
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin();

        return http.build();
    }

//    @Bean
//    SecurityFilterChain chain3(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .
//
//    }


}
