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
	

<a name="h2"/>

**USEFUL LINKS**

**Basic Authentication Wikipedia:**

https://en.wikipedia.org/wiki/Basic_access_authentication

**Basic Authentication Spring tutorial:**

https://spring.io/guides/gs/securing-web/