package com.example._SignUpLogIn.security.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@AllArgsConstructor
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http)
            throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/api/v*/registration/**")
                    .permitAll()
                .anyRequest()
                .authenticated().and()
                .formLogin();
    }
}
