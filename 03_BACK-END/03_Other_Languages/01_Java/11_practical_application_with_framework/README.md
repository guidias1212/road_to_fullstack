# 3.3.1.11) Practical Application With Framework

The following practical application is a project to help schools that still doesn't have an automated students presence control and still uses paper and pen for making all the presence accounting and storing (Based on the need of real public schools in Brazil). It was developed using Spring Boot, PostgreSQL, JPA + Hibernate, Thymeleaf and Lombok.

## Check it out:

https://school-bob.herokuapp.com/

## Source Code:

https://github.com/guidias1212/School-Bob

<details open>
<summary>Table of Contents</summary>
<br>

[Overview](#h1)

[Motivation](#h2)

[USEFUL LINKS](#h3)

</details>

<a name="h1"/>

**Overview:**

**Spring Boot** makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.

**JPA** is an abbreviation that stands for Java Persistence API. It’s a specification which is part of Java EE and defines an API for object-relational mappings and for managing persistent objects. 

**Hibernate** ORM (Hibernate in short) is an object-relational mapping tool for the Java programming language. It provides a framework for mapping an object-oriented domain model to a relational database. Hibernate handles object-relational impedance mismatch problems by replacing direct, persistent database accesses with high-level object handling functions.

**Thymeleaf** is a modern server-side Java template engine for both web and standalone environments.

Thymeleaf's main goal is to bring elegant natural templates to your development workflow — HTML that can be correctly displayed in browsers and also work as static prototypes, allowing for stronger collaboration in development teams.

Project **Lombok** is a java library that automatically plugs into your editor and build tools, spicing up your java.

<a name="h2"/>

**Motivation:**

School-Bob (Yes, I was not very creative with the name) was developed to help professors making the daily repetitive task of checking which student is in the classroom and which one is not. It also helps the school by storing the presence information as well as student information on a database instead of having a large ammount of physical paper documents. There are still a lot of work to be done on the project but the MVP (Minimum Viable Product) of this project is to check if the students came to the class or not.

<a name="h3"/>

**USEFUL LINKS**

**Spring boot CRUD tutorial:**

https://loiane.com/2019/01/crud-rest-api-using-spring-boot-2-hibernate-jpa-and-mysql/

**Spring boot project initializer:**

https://start.spring.io/

**Handling form submission in Spring:**
https://spring.io/guides/gs/handling-form-submission/