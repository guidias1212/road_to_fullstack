# 1.10) Design Patterns

In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations. Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

**This file will be revisited and updaded according to the demand on my personal usage of each Design Pattern.**

Following the answer from this Quora question: **Which are the most common design patterns in Web Applications?**

<details open>
<summary>Table of Contents</summary>
<br>

[MVC](#h1)

[ActiveRecord](#h2)

[IoC](#h3)

[Singleton](#h4)

[Facade](#h5)

[Adapter](#h6)

[Mediator Pattern](#h7)

[USEFULL LINKS](#h9)

</details>

<a name="h1"/>

**MVC:**

Model–View–Controller (usually known as MVC) is an architectural pattern commonly used for developing user interfaces that divides an application into three interconnected parts. This is done to separate internal representations of information from the ways information is presented to and accepted from the user. The MVC design pattern decouples these major components allowing for code reuse and parallel development.

<a name="h2"/>

**ActiveRecord:**

In software engineering, the active record pattern is an architectural pattern found in software that stores in-memory object data in relational databases. The interface of an object conforming to this pattern would include functions such as Insert, Update, and Delete, plus properties that correspond more or less directly to the columns in the underlying database table.

<a name="h3"/>

**IoC:**

In software engineering, inversion of control (IoC) is a programming principle. IoC inverts the flow of control as compared to traditional control flow. In IoC, custom-written portions of a computer program receive the flow of control from a generic framework. A software architecture with this design inverts control as compared to traditional procedural programming: in traditional programming, the custom code that expresses the purpose of the program calls into reusable libraries to take care of generic tasks, but with inversion of control, it is the framework that calls into the custom, or task-specific, code.

<a name="h4"/>

**Singleton:**

In software engineering, the singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance. This is useful when exactly one object is needed to coordinate actions across the system. The term comes from the mathematical concept of a singleton.

<a name="h5"/>

**Facade:**

The facade pattern (also spelled façade) is a software-design pattern commonly used in object-oriented programming. Analogous to a facade in architecture, a facade is an object that serves as a front-facing interface masking more complex underlying or structural code. A facade can:

* Improve the readability and usability of a software library by masking interaction with more complex components behind a single (and often simplified) API
* Provide a context-specific interface to more generic functionality (complete with context-specific input validation)
* Serve as a launching point for a broader refactor of monolithic or tightly-coupled systems in favor of more loosely-coupled code

<a name="h6"/>

**Adapter:**

In software engineering, the adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

<a name="h7"/>

**Mediator Pattern:**

In software engineering, the mediator pattern defines an object that encapsulates how a set of objects interact. This pattern is considered to be a behavioral pattern due to the way it can alter the program's running behavior. The front controller pattern is a specialized kind of mediator pattern. The front controller software design pattern is listed in several pattern catalogs and related to the design of web applications. It is "a controller that handles all requests for a website", which is a useful structure for web application developers to achieve the flexibility and reuse without code redundancy. 

<a name="h8"/>

**Consumer-Driven Contracts:**

The first thing to note is that document schemas are only a portion of what a service provider has to offer consumers to enable them to exploit its functionality. We call the sum total of these externalized exploitation points the provider contract.

**Provider Contracts:**

A provider contract expresses a service provider's business function capabilities in terms of the set of exportable elements necessary to support that functionality. From a service evolution point of view, a contract is a container for a set of exportable business function elements. A non-normative list of these elements includes:

* **Document schemas:** Next to interfaces, document schemas are the parts of a provider contract most likely to change as the service evolves; but perhaps because of this, they're also the parts we have most experience of imbuing with service evolution strategies such as extension points and document tree path assertions.

* **Interfaces:** In their simplest form, service provider interfaces comprise the set of exportable operation signatures a consumer can exploit to drive the behaviour of a provider. Message-oriented systems typically export relatively simple operation signatures and push the business intelligence into the messages they exchange. In a message-oriented system, received messages drive endpoint behaviour according to semantics encoded in the message header or payload. RPC-like services, on the other hand, encode more of their business semantics in their operation signatures. Either way, consumers depend on some portion of a provider's interface to realise business value, and in consequence we must account for interface consumption when evolving our service landscape.

* **Conversations:** Service providers and consumers exchange messages in conversations that compose one or more message exchange patterns such as request-response and fire-and-forget. Over the course of a conversation a consumer may expect the provider to externalize some state particular to the interaction in the messages that it sends and receives. For example, a hotel reservation service might offer consumers the ability to reserve a room at the outset of a conversation, and to confirm the booking and make a deposit in subsequent message exchanges. The consumer here might reasonably expect the service to "remember" the details of the reservation when engaging in these follow-on exchanges, rather than demand the parties repeat the entire conversation at each step in the process. As a service evolves, the set of conversational gambits available to provider and consumer might change. Conversations are thus candidates for being considered part of a provider contract.

* **Policy:** Besides exporting document schemas, interfaces and conversations, service providers may declare and enforce specific usage requirements that govern how the other elements of the contract can be realised. Most commonly, these requirements relate to the security and transactional contexts in which a consumer can exploit a provider's functionality. The Web services stack typically expresses this policy framework using the WS-Policy generic model plus additional domain-specific policy languages such as WS-SecurityPolicy, but in the context of our considering policies as candidates for being included in a provider contract, our definition of policy is specification and implementation agnostic.

* **Quality of service characteristics:** The business value potential that service providers and consumers exploit is often evaluated in the context of specific quality of service characteristics such as availability, latency and throughput. We should consider these characteristics as likely constituents of a provider contract and account for them in our service evolution strategies.

The definition of contract here is a little broader than the one we might usually offer when talking about services, but from a service evolution perspective it usefully abstracts the significant forces that impact our problem domain. That said, the definition is not meant to be exhaustive in terms of the kinds of elements a provider contract might contain: it refers simply to a logical set of exportable business function elements that are candidates for including in a service evolution strategy. From a logical point of view, this set of candidate elements is open, but in practice internal or external factors, such as interoperability requirements or platform limitations, may constrain the type of elements a contract can contain. For example, a contract belonging to a service that conforms to the WS-Basic profile will likely not contain policy elements.

Notwithstanding any such constraints, the scope of a contract is determined simply by the cohesion of its member elements. A contract can contain many elements and be broad in scope, or focus narrowly on only a few, just so long as it expresses some business function capability.

How do we decide whether to include a candidate contractual element in our provider contract? We do so by asking ourselves whether any of our consumers might reasonably express one or more expectations that the business function capability encapsulated by the element continue to be satisfied throughout the service's lifetime. We've already seen how consumers of our example service can express an interest in parts of the document schema exported by the service, and how they might assert that their expectations regarding this contractual element continue to be met. Thus, our document schema is part of our provider contract.

Provider contracts have the following characteristics:

* **Closed and complete:** Provider contracts express a service's business function capabilities in terms of the complete set of exportable elements available to consumers, and as such are closed and complete with respect to the functionality available to the system.

* **Singular and authoritative:** Provider contracts are singular and authoritative in their expression of the business functionality available to the system.

* **Bounded stability and immutability:** A provider contract is stable and immutable for a bounded period and/or locale (see the section "Validity of Data in Bounded Space and Time" in Pat Helland's paper Data on the Outside vs. Data on the Inside). Provider contracts typically use some form of versioning to differentiate differently bounded instances of the contract.

**Consumer Contracts:**

If we decide to account for consumer expectations regarding the schemas we expose when evolving our service - and consider it worth our provider knowing about them - then we need to import those consumer expectations into the provider. The Schematron assertions in our example look very much like the kinds of tests that, if implemented by the provider, might help ensure the provider continues to meet its commitments to its clients. By implementing these tests, the provider gains a better understanding of how it can evolve the structure of the messages it produces without breaking existing functionality in the service community. And where a proposed change would in fact break one or more consumers, the provider will have immediate insight into the issue and be better able to address it with the parties concerned, accommodating their requirements or providing incentives for them to change as business factors dictate.

Generalizing this structure, we can distinguish what we have already called the provider contract from the individual contractual obligations that obtain in instances of provider-consumer relationships, which we will now call consumer contracts. When a provider accepts and adopts the reasonable expectations expressed by a consumer, it enters into a consumer contract.

Consumer contracts have the following characteristics:

* **Open and incomplete:** Consumer contracts are open and incomplete with respect to the business functionality available to the system. They express a subset of the system's business function capabilities in terms of the consumer's expectations of the provider contract.

* **Multiple and non-authoritative:** Consumer contracts are multiple in proportion to the number of consumers of a service, and each is non-authoritative with regard to the total set of contractual obligations placed on the provider. The non-authoritative nature of the relationship extending from consumer to provider is one of the key features that distinguish a service-oriented architecture from a distributed application architecture. Service consumers must recognize that their peers in a service community are liable to consume the provider in ways quite different from their own. Peers may evolve at different rates and demand changes of the provider that potentially disturb the dependencies and expectations residing in other parts of the system. A consumer cannot anticipate how or when a peer will disturb the provider contract; a client in a distributed application has no such concerns.

* **Bounded stability and immutability:** Like provider contracts, consumer contracts are valid for a particular period of time and/or location.

**Consumer-Driven Contracts:**

Consumer contracts allow us to reflect on the business value being exploited at any point in a provider's lifetime. By expressing and asserting expectations of a provider contract, consumer contracts effectively define which parts of that provider contract currently support the business value realized by the system, and which do not. This leads us to suggest that service communities might benefit from being specified in the first instance in terms of consumer contracts. In this view, provider contracts emerge to meet consumer expectations and demands. To reflect the derived nature of this new contractual arrangement, we call such provider contracts consumer-driven contracts or derived contracts.

The derivative nature of consumer-driven provider contracts adds a heteronomous aspect to the relationship between service provider and consumer. That is, providers are subject to an obligation that originates from outside their boundaries. This in no way impacts on the fundamentally autonomous nature of their implementations; it simply makes explicit the fact that services depend for success on their being consumed.

Consumer-driven contracts have the following characteristics:

* **Closed and complete:** A consumer-driven contract is closed and complete with respect to the entire set of functionality demanded of it by its existing consumers. The contract represents the mandatory set of exportable elements required to support consumer expectations during the period in which those expectations remain valid for their parent applications.

* **Singular and non-authoritative:** Provider contracts are singular in their expression of the business functionality available to the system, but non-authoritative because derived from the union of existing consumer expectations.

* **Singular and non-authoritative:**

<a name="h9"/>

**USEFULL LINKS**

**Design Patterns History and information:**

https://en.wikipedia.org/wiki/Software_design_pattern

**Most used design patterns in Web Development:**

https://www.quora.com/Which-are-the-most-common-design-patterns-in-Web-Applications

**MVC:**

https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller

**Active Record:**

https://en.wikipedia.org/wiki/Active_record_pattern

**IoC:**

https://en.wikipedia.org/wiki/Inversion_of_control

**Singleton:**

https://en.wikipedia.org/wiki/Singleton_pattern

**Facade:**

https://en.wikipedia.org/wiki/Facade_pattern

**Adapter:**

https://en.wikipedia.org/wiki/Adapter_pattern

**Mediator Pattern:**

https://en.wikipedia.org/wiki/Front_controller

**Nice repository with Java design pattern examples:**

https://github.com/iluwatar/java-design-patterns

**Consumer Driven Contracts:**

https://martinfowler.com/articles/consumerDrivenContracts.html

