package com.icloud.template.java;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.client.RestTemplate;

public class TemplateInSpring {

    public static void main(String[] args) {
        // TODO 템플릿-콜백 패턴
        // JDBCTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        String query =
                "INSERT * " +
                "FROM Member";
        jdbcTemplate.execute(query);

        // RESTTemplate
        RestTemplate restTemplate = new RestTemplate();


    }

    @EnableWebSecurity
    static class SecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .anyRequest()
                    .permitAll();
        }
    }
}

