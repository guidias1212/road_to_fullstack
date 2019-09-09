package com.example.OAuthGitHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@SpringBootApplication
@Configuration
@EnableWebSecurity
public class OAuthGitHubApplication extends WebSecurityConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(OAuthGitHubApplication.class, args);
	}
	@Override  
    public void configure(HttpSecurity http) throws Exception {  
		
        http.antMatcher("/**")  
            .authorizeRequests()  
            .antMatchers("/", "/login**","/logout").permitAll()  
            .anyRequest().authenticated()  
            .and()
            .oauth2Login();
            

 
        http.logout()
        	.clearAuthentication(true)
        	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        	.logoutSuccessUrl("/logout.html")
        	.deleteCookies("JSESSIONID")
        	.invalidateHttpSession(true);  
    }  

}
