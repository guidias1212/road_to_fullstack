# 3.3.1.26) Spring Cloud Contract

Spring Cloud Contract is an umbrella project holding solutions that help users in successfully implementing the Consumer Driven Contracts approach. Currently Spring Cloud Contract consists of the Spring Cloud Contract Verifier project.

<details open>
<summary>Table of Contents</summary>
<br>

[Introduction](#h1)

[Purposes](#h2)

[What is a Contract](h3)

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

<a name="h3"/>

**What is a Contract:**

As consumers of services, we need to define what exactly we want to achieve. We need to formulate our expectations. That is why we write contracts. In other words, a contract is an agreement on how the API or message communication should look. Consider the following example:

Assume that you want to send a request that contains two numbers that needs to be added together. You want to send it to the /add endopoint. The following listing shows a contract to check which response a client should receive, in Groovy:

```
package contracts

Contract.make {
    description "Make an addition with 2 given numbers"
    request {
        method 'GET'

        headers {
            contentType("application/json")
        }
        urlPath ("/add") {
            queryParameters {
                parameter 'n1': value(1)
                parameter 'n2': value(1)
            }
        }
    }
    response {
        status OK()
        headers {
            contentType('application/json')
        }
        body(
                "sum" : 2
        )

    }
}
```
<a name="hx"/>

**USEFUL LINKS**

**Spring Cloud Contract Project:**

https://spring.io/projects/spring-cloud-contract

https://cloud.spring.io/spring-cloud-contract/reference/html/getting-started.html#getting-started

**Interesting article about Consumer-Driven Contracts:**

https://martinfowler.com/articles/consumerDrivenContracts.html
