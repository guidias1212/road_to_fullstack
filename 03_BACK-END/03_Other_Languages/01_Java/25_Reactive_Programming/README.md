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

**Observables Can Be Cold or Hot – and it Matters:**

At this point, you are trying to see what are the different streams (or observables) you are going to deal with in your program. But there are two classes of streams: hot and cold. Understanding the difference is key to successfully use reactive programming.

Cold observables are lazy. They don’t do anything until someone starts observing them (subscribe in RX). They only start running when they are consumed. Cold streams are used to represent asynchronous actions, for example, that it won’t be executed until someone is interested in the result. Another example would be a file download. It won’t start pulling the bytes if no one is going to do something with the data. The data produced by a cold stream is not shared among subscribers and when you subscribe you get all the items.

Hot streams are active before the subscription like a stock ticker, or data sent by a sensor or a user. The data is independent of an individual subscriber. When an observer subscribes to a hot observable, it will get all values in the stream that are emitted after it subscribes. The values are shared among all subscribers. For example, even if no one has subscribed to a thermometer, it measures and publishes the current temperature. When a subscriber registers to the stream, it automatically receives the next measure.

Why it’s so important to understand whether your streams are hot or cold? Because it changes how your code consumes the conveyed items. If you are not subscribed to a hot observable, you won’t receive the data, and this data is lost.

<a name="hx"/>

**USEFUL LINKS**

**Reactive programming introduction:**

https://dzone.com/articles/5-things-to-know-about-reactive-programming

**RXJava tutorial:**

https://www.baeldung.com/rxjava-tutorial





