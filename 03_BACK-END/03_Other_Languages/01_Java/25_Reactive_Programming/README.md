# 3.3.1.25) Reactive Programming - RX Java

When using reactive programming, data streams are going to be the spine of your application. Events, messages, calls, and even failures are going to be conveyed by a data stream. With reactive programming, you observe these streams and react when a value is emitted.

<details open>
<summary>Table of Contents</summary>
<br>

[Overview](#h1)

[USEFUL LINKS](#hx)

</details>

<a name="h1"/>

**Overview:**

In your code, you are going to create data streams of anything and from anything: click events, HTTP requests, ingested messages, availability notifications, changes on a variable, cache events, measures from a sensor, literally anything that may change or happen. This has an interesting side-effect on your application: it’s becoming inherently asynchronous.

**Reactive Extension (RX):**

Reactive eXtension (http://reactivex.io, a.ka. RX) is an implementation of the reactive programming principles to “compose asynchronous and event-based programs by using observable sequence”. With RX, your code creates and subscribes to data streams named Observables. While Reactive Programming is about the concepts, RX provides you an amazing toolbox. By combining the observer and iterator patterns and functional idioms, RX gives you superpowers. You have an arsenal of functions to combine, merge, filter, transform and create the data streams. The next picture illustrates the usage of RX in Java (using https://github.com/ReactiveX/RxJava).

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/rx.png)

<a name="hx"/>

**USEFUL LINKS**

**Reactive programming introduction:**

https://dzone.com/articles/5-things-to-know-about-reactive-programming





