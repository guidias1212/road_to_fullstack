# 3.3.1.24) Microservices

A microservice is an engineering approach focused on decomposing applications into single-function modules with well-defined interfaces which are independently deployed and operated by small teams who own the entire lifecycle of the service.

<details open>
<summary>Table of Contents</summary>
<br>

[Overview](#h1)

[Eureka Service Discovery](#h2)

[Spring Config Server](#h3)

[Client Side Load Balancer](#h4)

[Distributed Tracing](#h5)

[Zuul API Gateway](#h6)

[Authentication and Authorizarion Server](#h7)

[Hystrix - Error Handling in Distributed Systems](#h8)

[Bulkhead](#h9)

[USEFUL LINKS](#h10)

</details>

<a name="h1"/>

**Overview:**

Microservices accelerate delivery by minimizing communication and coordination between people while reducing the scope and risk of change.

Microservices characteristics:

**Single-function:**

Each and every service has a specific function or responsibility. And yes, a service can do many tasks, but all of them are nevertheless relevant to this single function.

**Well-defined interfaces:**

Services must provide an interface that defines how can we communicate with it. This basically defines a list of methods, and their inputs and outputs.

**Independent:**

Independent means services don’t know about each other implementation. They can get tested, deployed, and maintained independently.
It might be the case where services are implemented using different language stacks and communicate with different databases.
But that doesn’t mean they don’t work together. They do, in order to complete there required operation.

**Small Teams:**

We split the work up and team across the services. Each team focuses on a specific service, they don’t need to know about the internal workings of other teams.

Those teams are can work efficiently, communicate easily, and each service can be deployed rapidly as soon as it’s ready.

**Entire Lifecycle:**

The team is responsible for the entire lifecycle of the service; from coding, testing, staging, deploying, debugging, maintaining.

**Minimizing Communication:**

Minimizing communication doesn’t mean that the team members should ignore each other. It means the only essential cross-team communication should be through the interface that each service provides.
They all need to agree on the external interface so that communication between services is clearly defined.

**The scope and risk of change:**

Services should be changed without breaking other services. And so long as we don’t change the external interface there will be no problem for other services.
As a result of changes, the versions of services are updating individually, and there is no relationship between them.

<a name="h2"/>

**Eureka Service Discovery:**

This project provides Netflix OSS integrations for Spring Boot apps through autoconfiguration and binding to the Spring Environment and other Spring programming model idioms. With a few simple annotations you can quickly enable and configure the common patterns inside your application and build large distributed systems with battle-tested Netflix components. The patterns provided include Service Discovery (Eureka), Circuit Breaker (Hystrix), Intelligent Routing (Zuul) and Client Side Load Balancing (Ribbon).

<a name="h3"/>

**Spring Config Server:**

Spring Cloud Config Server provides an HTTP resource-based API for external configuration (name-value pairs or equivalent YAML content). The server is embeddable in a Spring Boot application, by using the @EnableConfigServer annotation. Consequently, the following application is a config server.

<a name="h4"/>

**Client Side Load Balancer:**

Load Balancing automatically distributes incoming application traffic between two or more computers. It enables you to achieve fault tolerance in your applications, seamlessly providing the required amount of load balancing capacity needed to route application traffic. Load balancing aims to optimize resource use, maximize throughput, minimize response time, and avoid overload of any single resource. Using multiple components with load balancing instead of a single component may increase reliability and availability through redundancy.

<a name="h5"/>

**Distributed Tracing:**

Distributed tracing, also called distributed request tracing, is a method used to profile and monitor applications, especially those built using a microservices architecture. Distributed tracing helps pinpoint where failures occur and what causes poor performance.

<a name="h6"/>

**Zuul API Gateway:**

Zuul is an L7 application gateway that provides capabilities for dynamic routing, monitoring, resiliency, security, and more.

<a name="h7"/>

**Authentication and Authorizarion Server:**

OAuth 2.0 is a protocol that allows a user to grant limited access to their resources on one site, to another site, without having to expose their credentials.

<a name="h8"/>

**Hystrix - Error Handling in Distributed Systems:**

Hystrix is a latency and fault tolerance library designed to isolate points of access to remote systems, services and 3rd party libraries, stop cascading failure and enable resilience in complex distributed systems where failure is inevitable.

<a name="h9"/>

**Bulkhead:**

In general, the goal of the bulkhead pattern is to avoid faults in one part of a system to take the entire system down. The term comes from ships where a ship is divided in separate watertight compartments to avoid a single hull breach to flood the entire ship; it will only flood one bulkhead.

<a name="h10"/>

**USEFUL LINKS**

**Microservices Wiki:**

https://en.wikipedia.org/wiki/Microservices

**Microservices Example:**

https://examples.javacodegeeks.com/spring-boot-microservices-example/

**Good video about Microservices using Open Feign and Eureka Server:**

https://www.youtube.com/watch?v=a6Sxyc1v7U4

**Eureka Service Register Tutorial:**

https://spring.io/guides/gs/service-registration-and-discovery/

**Spring Config Server Tutorial:**

https://cloud.spring.io/spring-cloud-config/multi/multi__spring_cloud_config_server.html

**Client Side Load Balancing Tutorial:**

https://dzone.com/articles/spring-cloud-netflix-load-balancer-with-ribbonfeig

**Distributed Tracing Tool:**

https://www.papertrail.com/

**Zuul Tutorial:**

https://howtodoinjava.com/spring-cloud/spring-cloud-api-gateway-zuul/

**OAuth2 Authentication Server Tutorial:**

https://spring.io/guides/tutorials/spring-boot-oauth2/

**Hystrix Tutorial:**

https://spring.io/guides/gs/circuit-breaker/

**Bulkheading with Hystrix:**

https://medium.com/better-programming/maintaining-resiliency-in-a-microservice-architecture-729021f5369a

**These courses (Portuguese) are awesome for learning microservices:**

https://cursos.alura.com.br/course/microservices-spring-cloud-service-registry-config-server

https://www.alura.com.br/curso-online-microservices-spring-cloud-circuit-breaker-api-gateway
