# 3.3.1.15.1) OAuth

OAuth is an open standard for access delegation, commonly used as a way for Internet users to grant websites or applications access to their information on other websites but without giving them the passwords. This mechanism is used by companies such as Amazon, Google, Facebook, Microsoft and Twitter to permit the users to share information about their accounts with third party applications or websites.

## Check an example made with Spring Boot:

https://example-oauth.herokuapp.com

<details open>
<summary>Table of Contents</summary>
<br>

[Overview](#h1)

[Architecture](#h2)

[Client Credentials](#h3)

[Obtaining an Access Token](#h4)

[Accessing a Protected Resource](#h5)

[Extensibility](#h6)

[IANA Considerations](#h7)

[Spring Boot Example](#h8)

[USEFUL LINKS](#h9)

</details>

<a name="h1"/>

**Overview:**

**What is OAuth 2.0?**

OAuth is an open authorization protocol, which allows accessing the resources of the resource owner by enabling the client applications on HTTP services such as Facebook, GitHub, etc. It allows sharing of resources stored on one site to another site without using their credentials. It uses username and password tokens instead.

OAuth 2.0 is developed by the IETF OAuth Working Group, published in October 2012.

**Why Use OAuth 2.0?**

You can use OAuth 2.0 to read data of a user from another application.

It supplies the authorization workflow for web, desktop applications, and mobile devices.

It is a server side web app that uses authorization code and does not interact with user credentials.

**Features of OAuth 2.0**

OAuth 2.0 is a simple protocol that allows to access resources of the user without sharing passwords.

It provides user agent flows for running clients application using a scripting language, such as JavaScript. Typically, a browser is a user agent.

It accesses the data using tokens instead of using their credentials and stores data in online file system of the user such as Google Docs or Dropbox account.

**Advantages of OAuth 2.0**

OAuth 2.0 is a very flexible protocol that relies on SSL (Secure Sockets Layer that ensures data between the web server and browsers remain private) to save user access token.

OAuth 2.0 relies on SSL which is used to ensure cryptography industry protocols and are being used to keep the data safe.

It allows limited access to the user's data and allows accessing when authorization tokens expire.

It has ability to share data for users without having to release personal information.

It is easier to implement and provides stronger authentication.

**Disadvantages of OAuth 2.0**

If you are adding more extension at the ends in the specification, it will produce a wide range of non-interoperable implementations, which means you have to write separate pieces of code for Facebook, Google, etc.

If your favorite sites are connected to the central hub and the central account is hacked, then it will lead to serious effects across several sites instead of just one.

<a name="h2"/>

**Architecture:**

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/OAuth_diagram.png)

* **Step 1** − First, the user accesses resources using the client application such as Google, Facebook, Twitter, etc.

* **Step 2** − Next, the client application will be provided with the client id and client password during registering the redirect URI (Uniform Resource Identifier).

* **Step 3** − The user logs in using the authenticating application. The client ID and client password is unique to the client application on the authorization server.

* **Step 4** − The authenticating server redirects the user to a redirect Uniform Resource Identifier (URI) using authorization code.

* **Step 5** − The user accesses the page located at redirect URI in the client application.

* **Step 6** − The client application will be provided with the authentication code, client id and client password, and send them to the authorization server.

* **Step 7** − The authenticating application returns an access token to the client application.

* **Step 8** − Once the client application gets an access token, the user starts accessing the resources of the resource owner using the client application.

<a name="h3"/>

**Client Credentials:**

The client credentials can be used as an authorization grant when the client is the resource owner, or when the authorization scope is limited to protected resources under the control of the client.

The client requests an access token only with the help of client credentials.

The client credentials authorization flow is used to acquire access token to authorize API requests.

Using client credentials authorization, access token which is acquired, only grants permission for your client application to search and get catalog documents.

The following figure depicts the Client Credentials Flow:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/client_credentials_flow.png)

The flow illustrated in the above figure consists of the following steps:

* **Step 1** − The client authenticates with the authorization server and makes a request for access token from the token endpoint.

* **Step 2** − The authorization server authenticates the client and provides access token if it's valid and authorized.

**Obtaining End-User Authorization:**

The authorization end point is typically URI on the authorization server in which the resource owner logs in and permits to access the data to the client application.

**Authorization Response:**

The authorization response can be used to get the access token for accessing the owner resources in the system using the authorization code.

**Error Response and Codes:**

The authorization server responds with a HTTP 400 or 401 (bad request) status codes, if an error occurs during authorization.

<a name="h4"/>

**Obtaining an Access Token:**

An access token is a string that identifies a user, an application, or a page. The token includes information such as when the token will expire and which app created that token.

* First, it is necessary to acquire OAuth 2.0 client credentials from API console.

* Then, the access token is requested from the authorization server by the client.

* It gets an access token from the response and sends the token to the API that you wish to access.

You must send the user to the authorization endpoint at the beginning. Following is an example of a dummy request:
```
https://publicapi.example.com/oauth2/authorize?client_id=your_client_id&redirect_uri=your_url&response_type=code
```

Following are the parameters and their descriptions:

* **client_id** − It should be set to the client id of your application.

* **redirect_uri** − It should be set to the URL. After the request is authorized, the user will be redirected back.

* **response_type** − It can either be a code or a token. The code must be used for server side applications, whereas the token must be used for client side applications. In server side applications, you can make sure that the secrets are saved safely.

**Concepts of Client Credentials:**

1) **Authorization Code:** The authorization code allows accessing the authorization request and grants access to the client application to fetch the owner resources.

2) **Resource Owner Password Credentials:** The resource owner password credentials include only one request and one response, and is useful where the resource owner has a good relationship with the client.

3) **Assertion:** Assertion is a package of information that makes the sharing of identity and security information across various security domains possible.

4) **Refresh Token:** The refresh tokens are used to acquire a new access tokens, which carries the information necessary to get a new access token.

5) **Access Token Response:** Access token is a type of token that is assigned by the authorization server.

6) **Access Token Error Response Codes:** If the token access request, which is issued by the authorization server is invalid or unauthorized, then the authorization server returns an error response.

<a name="h5"/>

**Accessing a Protected Resource:**

The client provides an access token to the resource server to access protected resources. The resource server must validate and verify that the access token is valid and has not expired.

There are two standard ways of sending credentials

1) **Bearer Token:** The access token can only be placed in POST request body or GET URL parameter as a fallback option in the authorization HTTP header.

They are included in the authorization header:
```
Authorization: Bearer [token-value]
```

For Example:
```
GET/resource/1 HTTP /1.1
Host: example.com
Authorization: Bearer abc...
```

2) **MAC:** A cryptographic Message Authentication Code (MAC) is computed using the elements of the request and is sent to the authorization header. Upon receiving the request, the MAC is then compared and computed by the resource owner.

**Concepts of accessing protected resource:**

1) **Authenticated Requests:** It is used to get the authorization code token for accessing the owner resources in the system.

2) **The WWW-Authenticate Response Header Field:** The resource server includes the "WWW-Authenticate" response header field, if the protected resource request contains an invalid access token.

<a name="h6"/>

**Extensibility:**

There are two ways in which the access token types can be defined:

* By registering in the access token type's registry.

* By using a unique absolute URI (Uniform Resource Identifier) as its name.

**Defining New Endpoint Parameters**

Parameter names must obey the param-name ABNF (Augmented Backus-Naur Form is a metalanguage based on Backus-Naur Form consisting of its own syntax and derivation rules) and the syntax of parameter values must be well-defined.
```
param-name = 1* name-char
name-char = "-" / "." / "_" / DIGIT / ALPHA
```

**Defining New Authorization Grant Types**

New authorization grant types can be assigned a distinct absolute URI for use, with the help of "grant_type" parameter. The extension grant type must be registered in the OAuth parameters registry, if it requires additional token endpoint parameters.

**Defining New Authorization Endpoint Response Types**
```
response-type = response-name *(SP response-name)
response-name = 1* response-char
response-char = "_" / DIGIT / ALPHA
```

The response type is compared as space-delimited list of values, if it has one or more space characters where the order of the values does not matter and only one order of value can be registered.

**Defining Additional Error Codes:**

The extension error codes must be registered, if the extensions they use are either a registered access token, or a registered endpoint parameter. The error code must obey the error ABNF (Augmented Backus-Naur Form) and when possible it should be prefixed by a name identifying it.
```
error = 1 * error_char
error-char =  %x20-21 / %x23-5B / 5D-7E
```

<a name="h7"/>

**IANA Considerations:**

IANA stands for Internet Assigned Numbers Authority which provides the information about the registration values related to the Remote Authentication Dial In User Service (RADIUS).

IANA includes the following considerations:

**OAuth Access Token Types Registry**

OAuth access tokens are registered by experts with required specification. If they are satisfied with the registration, only then they will publish the specification. The registration request will be sent to the @ietf.org for reviewing with the subject ("Request for access token type: example"). Experts will either reject or accept the request within 14 days of the request.

**Registration Template**

The registration template contains the following specifications:

* **Type Name:** It is the name of the request.

* **Token Endpoint Response Parameters:** The additional access token response parameter will be registered separately in OAuth parameters registry.

* **HTTP Authentication Scheme:** The HTTP authentication scheme can be used to authenticate the resources by using the access token.

* **Change Controller:** Give the state name as "IETF" for standard track RFCs, and for others, use the name of the responsible party.

* **Specification Document:** The specification document contains the parameter that can be used to retrieve a copy of the document.

**OAuth Parameters Registry**

OAuth parameters registry contains registration of authorization endpoint request or response, token endpoint request or response by the experts with the required specification. The registration request will be sent to the experts and if they are satisfied with registration, then they will publish the specification.

**Registration Template**

The registration template contains specifications such as Type Name, Change Controller and Specification Document as defined in the above OAuth Access Token Types Registry section, except the following specification:

* **Parameter Usage Location:** It specifies the location of the parameter such as authorization request or response, token request or response.

**Initial Registry Contents**

The following table shows OAuth parameters registry containing the initial contents:

| Parameter Name & Usage Location | Change Controller | Specification Document |
| --- | --- | --- |
| **client_id** | authorization request, token request | IETF RFC 6749 |
| **client_secret** | token request | IETF RFC 6749 |
| **response_type** | authorization_request | IETF RFC 6749 |
| **redirect_uri** | authorization request, authorization | IETF RFC 6749 |
| **scope** | authorization request or response, token request or response | IETF RFC 6749 |
| **state** | authorization request or response | IETF RFC 6749 |
| **code** | token request, authorization response | IETF RFC 6749 |
| **error_description** | authorization response, token response | IETF RFC 6749 |
| **error_uri** | authorization response, token response | IETF RFC 6749 |
| **grant_type** | token request | IETF	RFC 6749 |
| **access_token** | authorization response, token response | IETF RFC 6749 |
| **token_type** | authorization response, token response | IETF RFC 6749 |
| **expires_in** | authorization response, token response | IETF RFC 6749 |
| **username** | token request | IETF RFC 6749 |
| **password** | token request | IETF RFC 6749 |
| **refresh_token** | token request, token response | IETF RFC 6749 |

**OAuth Authorization Endpoint Response Type Registry**

This can be used to define OAuth Authorization Endpoint Response Type Registry. The response types are registered by experts with the required specification and if they are satisfied with the registration, only then they will publish the specification. The registration request will be sent to the @ietf.org for reviewing. The experts will either reject or accept the request within 14 days of the request.

**Registration Template**

The registration template contains specifications such as Type Name, Change Controller and Specification Document as defined in the above OAuth Access Token Types Registry section.

**Initial Registry Contents**

The following table shows the authorization endpoint response type registry containing the initial contents.

| Parameter Name | Change Controller | Specification Document |
| --- | --- | --- |
| code | IETF | RFC 6749 |
| token | IETF | RFC 6749 |

**OAuth Extensions Error Registry**

This can be used to define OAuth Extensions Error Registry. The error codes along with protocol extensions such as grant types, token types, etc. are registered by experts with the required specification. If they are satisfied with the registration, then they will publish the specification. The registration request will be sent to the @ietf.org for reviewing with subject ("Request for error code: example"). Experts will either reject or accept the request within 14 days of the request.

**Registration Template**

The registration template contains specifications such as Change Controller and Specification Document as defined in the above OAuth Access Token Types Registry section, except the following specifications:

* **Error Name:** It is the name of the request.

* **Error Usage Location:** It specifies the location of the error such as authorization code grant error response, implicit grant response or token error response, etc, which specifies where the error can be used.

* **Related Protocol Extension:** You can use protocol extensions such as extension grant type, access token type, extension parameter, etc.

<a name="h8"/>

**Spring Boot Example:**

* Create a GitHub under Settings > Developer Settings > OAuth Apps > Register a new application and get your **Client ID** and **Client Secret**.

* Create a new Spring Boot application using Spring Initialzr bootstrap and add **OAuth2 Client**, **thymeleaf**, **Spring Web** and **Spring Security** dependencies.

* Add an index page:

index.html
```
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OAuth Example Application</title>
</head>
<body>
    <h1>Spring Security OAuth SSO (Simple Sign On) example app</h1>  
    <a href="login.html">Login</a> 
</body>
</html>
```

* Add a login page:

login.html
```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
  <head>
    <title>Login page</title>
  </head>
  <body>
    <h1>Login page</h1>
    <p>The scope of this application is to make the user login with an external application. There is no way to login using the username + password below. Click on "Login with GitHub to check it and later try to manually go to /home without logging in"</p>
    <form th:action="@{/login.html}" method="post">
      <label for="username">Username</label>:
      <input type="text" id="username" name="username" autofocus="autofocus" /> <br />
      <label for="password">Password</label>:
      <input type="password" id="password" name="password" /> <br />
      <input type="submit" value="Log in" />
    </form>
    <br>
    <br>
    <p>Or</p>
    <br>
    <br>
    <a href="Auth_GitHub">Login with GitHub</a> 
  </body>
</html>
```

* Add a home page (secured):

home.html
```
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OAuth Example Application</title>
</head>
<body>
    <h1>-Secured Page Example-</h1>
    <br>
    <a href="/logout">Logout</a>
    <br>
    <br>
    <div>User Name: <span th:text="${userName}"></span></div>   
    <br>
    <br>
    <div>Here is a complete list of user attributes from GitHub that could be used:</div>
    <br>
    <br>
    <div>User Attributes: <span th:text="${userAttributes}"></span></div> 
</body>
</html>
```

* Add a logout page:

logout.html
```
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OAuth Example Application</title>
</head>
<body>
    <h1>Successfully logged out</h1>
    <br>
    <a href="/">Back</a>
    <br>
    <br>
</body>
</html>
```


* Add the following configurations:

pom.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.8.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.example</groupId>
	<artifactId>OAuthGitHub</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>war</packaging>
	<name>OAuthGitHub</name>
	<description>Demo project for Spring Boot</description>

	<properties>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
	      	<groupId>org.springframework.boot</groupId>
	      	<artifactId>spring-boot-starter-oauth2-client</artifactId>
	    </dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

```

* Add a controller:

WebController.java
```
@Controller  
public class WebController {  

    @RequestMapping("/Auth_GitHub")  
    public String auth_GitHub(Model model,
    						  @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,  
                              @AuthenticationPrincipal OAuth2User oauth2User,
                              HttpServletRequest request) {  
    	HttpSession session = request.getSession(true);
    	session.setAttribute("user",oauth2User);
    	return "redirect:" + "home";
    }   
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
    	HttpSession session = request.getSession(false);
    	if (session.getAttribute("user") != null) {
    		OAuth2User user = (OAuth2User) session.getAttribute("user");
        	model.addAttribute("userName", user.getName());  
            model.addAttribute("userAttributes", user.getAttributes()); 
        	return "home";
    	} else {
    		return "home";
    	}
    	
    }
    
    
    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String login() {
      return "login.html";
    }
    
    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    public void loginPost() {
      login();
    }
}
```

* Add configuration:

application.yml
```
spring: 
  thymeleaf:  
    cache: false  
  security:  
    oauth2:  
      client:  
        registration:  
          github:  
            client-id: <your GitHub client id here>
            client-secret: <your github client secret here>
```

* On the main spring boot method:

OAuthGitHubApplication.java
```
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
```

<a name="h9"/>

**USEFUL LINKS**

**OAuth Wikipedia:**

https://en.wikipedia.org/wiki/OAuth

**Differences between OAuth and OAuth 2.0:**

https://stackoverflow.com/questions/4113934/how-is-oauth-2-different-from-oauth-1

**OAuth 2.0 concept tutorial:**

https://www.tutorialspoint.com/oauth2.0/index.htm

**OAuth 2.0 tutorial with Spring:**

https://developer.okta.com/blog/2019/05/15/spring-boot-login-options

**OAuth logout:**

https://stackoverflow.com/questions/36557294/spring-security-logout-does-not-work-does-not-clear-security-context-and-authe

https://www.baeldung.com/spring-security-logout

**Set OAuth redirect name:**

https://dzone.com/articles/spring-boot-how-to-solve-oauth2-redirect-uri-misma

**Thymeleaf login with Spring security:**

https://www.thymeleaf.org/doc/articles/springsecurity.html

**Authentication full tutorial:**

https://www.callicoder.com/spring-boot-security-oauth2-social-login-part-1/

https://www.callicoder.com/spring-boot-security-oauth2-social-login-part-2/

