# 1.4) SOLID, KISS, YAGNI

* **SOLID**

In object-oriented computer programming, SOLID is a mnemonic acronym for five design principles intended to make software designs more understandable, flexible and maintainable.

**Single responsibility principle:** A class or module should have one, and only one, reason to be changed (i.e. rewritten). As an example, consider a module that compiles and prints a report. Imagine such a module can be changed for two reasons. First, the content of the report could change. Second, the format of the report could change. These two things change for very different causes; one substantive, and one cosmetic. The single responsibility principle says that these two aspects of the problem are really two separate responsibilities, and should therefore be in separate classes or modules. It would be a bad design to couple two things that change for different reasons at different times.

**Open–closed principle:** In object-oriented programming, the open/closed principle states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification" that is, such an entity can allow its behaviour to be extended without modifying its source code.

**Liskov substitution principle:** Substitutability is a principle in object-oriented programming stating that, in a computer program, if S is a subtype of T, then objects of type T may be replaced with objects of type S (i.e. an object of type T may be substituted with any object of a subtype S) without altering any of the desirable properties of the program (correctness, task performed, etc.).

**Interface segregation principle:** In the field of software engineering, the interface-segregation principle (ISP) states that no client should be forced to depend on methods it does not use. ISP splits interfaces that are very large into smaller and more specific ones so that clients will only have to know about the methods that are of interest to them. Such shrunken interfaces are also called role interfaces. ISP is intended to keep a system decoupled and thus easier to refactor, change, and redeploy.

**Dependency inversion principle:** In object-oriented design, the dependency inversion principle is a specific form of decoupling software modules. When following this principle, the conventional dependency relationships established from high-level, policy-setting modules to low-level, dependency modules are reversed, thus rendering high-level modules independent of the low-level module implementation details. The principle states:

- High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g. interfaces).
- Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

* **KISS**

Keep it Simple, Stupid: The KISS principle is about striving for simplicity. Modern programming languages, frameworks and APIs have powerful means to create sophisticated solutions for various kinds of problems. Sometimes developers might feel tempted to write “clever” solutions that use all these complex features. The KISS principle states that a solution is better when it uses less inheritance, less polymorphism, fewer classes, etc

* **YAGNI**

"You aren't gonna need it" is a principle of extreme programming (XP) that states a programmer should not add functionality until deemed necessary. XP co-founder Ron Jeffries has written: "Always implement things when you actually need them, never when you just foresee that you need them." Other forms of the phrase include "You aren't going to need it" and "You ain't gonna need it".

**USEFULL LINKS**

**SOLID - Wikipedia:**

https://en.wikipedia.org/wiki/SOLID

**KISS - Wikipedia:**

https://en.wikipedia.org/wiki/KISS_principle

**YAGNI - Wikipedia:**

https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it
