package com.fintech.decabank.config;

import lombok.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;


@Configuration
@Builder
public class SecurityConfig {



    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/myAccount").authenticated()
                .requestMatchers("/myBalance").authenticated()
                .requestMatchers("/myCardDetails").authenticated()
                .requestMatchers("/myLoanRecord").authenticated()
                .requestMatchers("/notices", "/contactUs", "/homepage", "/register").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();




//        To deny all requests, irrespective of authorization or roles
//        http.authorizeHttpRequests().anyRequest().denyAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();

//                To permit all requests, irrespective of authorization or roles
//                Not recommended for Application production
//        http.authorizeHttpRequests().anyRequest().permitAll()
//                .and().formLogin()
//                .and().httpBasic();

//        return http.build();
    }

  /*  @Bean
    public InMemoryUserDetailsManager userDetailsService() {
//        Method 1
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("Ada")
//                .password("1234")
//                .authorities("admin")
//                .build();
//
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("Obi")
//                .password("1234")
//                .authorities("user")
//                .build();

//        return new InMemoryUserDetailsManager(admin, user);

//        Method 1a
        UserDetails admin = User.withUsername("Ada")
                .password("1234")
                .authorities("admin")
                .build();

        UserDetails user = User.withUsername("Obi")
                .password("1234")
                .authorities("user")
                .build();

        return new InMemoryUserDetailsManager(admin, user);


//        Method 2
//        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
//        UserDetails admin = User.withUsername("Ada").password("1234").authorities("admin").build();
//        UserDetails user = User.withUsername("Obi").password("1234").authorities("user").build();
//
//        inMemoryUserDetailsManager.createUser(admin);
//        inMemoryUserDetailsManager.createUser(user);
//        return inMemoryUserDetailsManager;
    } */

    /* Method 3: Using JdbcUserDetailsManager

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    } */


   /* @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    */

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}

