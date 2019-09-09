# 3.3.1.15.2) Basic Authentication

In the context of an HTTP transaction, basic access authentication is a method for an HTTP user agent (e.g. a web browser) to provide a user name and password when making a request. In basic HTTP authentication, a request contains a header field in the form of Authorization: Basic <credentials>, where credentials is the base64 encoding of id and password joined by a single colon :.

<details open>
<summary>Table of Contents</summary>
<br>

[Spring Boot tutorial](#h1)

[USEFUL LINKS](#h2)

</details>

<a name="h1"/>

**Spring Boot tutorial:**

* Create a Spring initializr project with the following dependencies:
	* Spring Web
	* Spring Security
	* Thymeleaf
	
* Create a secured home page:

home.html
```
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org" xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Spring Security Example</title>
    </head>
    <body>
        <h1>Welcome!</h1>

        <p>Click <a th:href="@{/hello}">here</a> to see a greeting.</p>
    </body>
</html>
```

* Create a hello user page:

hello.html
```
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <h1 th:inline="text">Hello [[${#httpServletRequest.remoteUser}]]!</h1>
        <form th:action="@{/logout}" method="post">
            <input type="submit" value="Sign Out"/>
        </form>
    </body>
</html>
```

* Create a Spring MVC configuration file:

MvcConfig.java
```
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }

}
```

* Create a Web Security configuration file:

WebSecurityConfig
```
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
```

* Create a login page:

login.html
```
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Spring Security Example </title>
    </head>
    <body>
        <div th:if="${param.error}">
            Invalid username and password.
        </div>
        <div th:if="${param.logout}">
            You have been logged out.
        </div>
        <form th:action="@{/login}" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <div><input type="submit" value="Sign In"/></div>
        </form>
    </body>
</html>
```

This will produce the following result:

* Welcome page:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/basic_auth_welcome.png)

---------------

* Login page:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/basic_auth_login.png)

---------------

* Invalid user attempt:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/basic_auth_fail.png)

---------------

* Successful user login:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/basic_auth_success.png)

---------------

<a name="h2"/>

**USEFUL LINKS**

**Basic Authentication Wikipedia:**

https://en.wikipedia.org/wiki/Basic_access_authentication

**Basic Authentication Spring tutorial:**

https://spring.io/guides/gs/securing-web/

**Deprecated .withDefaultPasswordEncoder():**

https://stackoverflow.com/questions/49847791/java-spring-security-user-withdefaultpasswordencoder-is-deprecated