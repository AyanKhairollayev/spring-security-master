package kz.khairollayev.springsecuritymaster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf().disable()
                .authorizeHttpRequests((requests) ->
                        requests.anyRequest().authenticated()
                )
                .formLogin()
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/afterLogin/success")
                .failureForwardUrl("/afterLogin/failure")
                .and()
                .build();
    }
}
