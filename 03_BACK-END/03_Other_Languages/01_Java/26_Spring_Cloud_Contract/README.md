# 3.3.1.26) Spring Cloud Contract

Spring Cloud Contract is an umbrella project holding solutions that help users in successfully implementing the Consumer Driven Contracts approach. Currently Spring Cloud Contract consists of the Spring Cloud Contract Verifier project.

<details open>
<summary>Table of Contents</summary>
<br>

[Introduction](#h1)

[Purposes](#h2)

[USEFUL LINKS](#hx)

</details>

<a name="h1"/>

**Introduction:**

Consumer-Driven Contracts are a pattern for evolving services. In Consumer-Driven Contracts, each consumer captures their expectations of the provider in a separate contract. All of these contracts are shared with the provider so they gain insight into the obligations they must fulfill for each individual client.

<a name="h2"/>

**Purposes:**

The main purposes of Spring Cloud Contract are:

* To ensure that HTTP and Messaging stubs (used when developing the client) do exactly what the actual server-side implementation does.

* To promote the ATDD (acceptance test-driven developement) method and the microservices architectural style.

* To provide a way to publish changes in contracts that are immediately visible on both sides.

* To generate boilerplate test code to be used on the server side.

<a name="hx"/>

**USEFUL LINKS**

**Spring Cloud Contract Project:**

https://spring.io/projects/spring-cloud-contract

https://cloud.spring.io/spring-cloud-contract/reference/html/getting-started.html#getting-started

**Interesting article about Consumer-Driven Contracts:**

https://martinfowler.com/articles/consumerDrivenContracts.html
