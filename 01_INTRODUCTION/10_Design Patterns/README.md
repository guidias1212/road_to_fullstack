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

[USEFULL LINKS](#h8)

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

