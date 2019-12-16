# 3.3.1.24) Microservices

A microservice is an engineering approach focused on decomposing applications into single-function modules with well-defined interfaces which are independently deployed and operated by small teams who own the entire lifecycle of the service.

<details open>
<summary>Table of Contents</summary>
<br>

[Overview](#h1)

[USEFUL LINKS](#hx)

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



<a name="hx"/>

**USEFUL LINKS**

**Microservices Wiki:**

https://en.wikipedia.org/wiki/Microservices

**Microservices Example:**

https://examples.javacodegeeks.com/spring-boot-microservices-example/

**Good video about Microservices using Open Feign and Eureka Server:**

https://www.youtube.com/watch?v=a6Sxyc1v7U4





