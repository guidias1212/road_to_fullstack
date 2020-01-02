# 3.3.1.26) Spring Cloud Contract

Spring Cloud Contract is an umbrella project holding solutions that help users in successfully implementing the Consumer Driven Contracts approach. Currently Spring Cloud Contract consists of the Spring Cloud Contract Verifier project.

<details open>
<summary>Table of Contents</summary>
<br>

[Introduction](#h1)

[Purposes](#h2)

[What is a Contract](#h3)

[On the Producer side](#h4)

[On the Consumer side](#h5)

[Contract Usefull Terms](#h6)

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

To start working with Spring Cloud Contract, you can add files with REST or messaging contracts expressed in either Groovy DSL or YAML to the contracts directory, which is set by the contractsDslDir property. 

By default, it is:
```
$rootDir/src/test/resources/contracts.
```

<a name="h4"/>

**On the Producer side:**

Add the Spring Cloud Contract Verifier dependency and plugin to your build file, as the following example shows:
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-contract-verifier</artifactId>
    <scope>test</scope>
</dependency>
```

The following listing shows how to add the plugin, which should go in the build/plugins portion of the file:
**Pay attention here, the test folders and the folders where the contracts are should match. Check an example project and see how it is supposed to be done.**
```
<plugin>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-contract-maven-plugin</artifactId>
    <version>${spring-cloud-contract.version}</version>
    <extensions>true</extensions>
    <configuration>
        <packageWithBaseClasses>com.example.contractTest.BaseTestClass</packageWithBaseClasses> 
    </configuration>
</plugin>
```

<a name="h5"/>

**On the Consumer side:**

You can use Spring Cloud Contract Stub Runner in the integration tests to get a running WireMock instance or messaging route that simulates the actual service.

To do so, add the dependency to Spring Cloud Contract Stub Runner, as the following example shows:
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-contract-stub-runner</artifactId>
    <scope>test</scope>
</dependency>
```

Pass the stub artifact IDs and artifact repository URL as Spring Cloud Contract Stub Runner properties, as the following example shows:
```
stubrunner:
  ids: 'com.example:http-server-dsl:+:stubs:8080'
  repositoryRoot: https://repo.spring.io/libs-snapshot
```

Now you can annotate your test class with @AutoConfigureStubRunner. In the annotation, provide the group-id and artifact-id values for Spring Cloud Contract Stub Runner to run the collaborators' stubs for you, as the following example shows:
```
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.example:http-server-dsl:+:stubs:6565"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class LoanApplicationServiceTests {
...
}
```

<a name="h6"/>

Contract Usefull Terms

**Contract Terms List:**

Here is an usefull list of contract terms:
```
T anyAlphaUnicode();

T anyAlphaNumeric();

T anyNumber();

T anyInteger();

T anyPositiveInt();

T anyDouble();

T anyHex();

T aBoolean();

T anyIpAddress();

T anyHostname();

T anyEmail();

T anyUrl();

T anyHttpsUrl();

T anyUuid();

T anyDate();

T anyDateTime();

T anyTime();

T anyIso8601WithOffset();

T anyNonBlankString();

T anyNonEmptyString();

T anyOf(String... values);
```

<a name="hx"/>

**USEFUL LINKS**

**Spring Cloud Contract Project:**

https://spring.io/projects/spring-cloud-contract

https://cloud.spring.io/spring-cloud-contract/reference/html/getting-started.html#getting-started

**Interesting article about Consumer-Driven Contracts:**

https://martinfowler.com/articles/consumerDrivenContracts.html

**Spring Cloud Contract Simple Tutorial:**

https://spring.io/guides/gs/contract-rest/

**Spring Cloud Contract Portuguese Guide:**

https://diegolirio.wordpress.com/2019/10/22/spring-cloud-contract-pt-1/

https://diegolirio.wordpress.com/2019/10/29/spring-cloud-contract-stub-runner/
