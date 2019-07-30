# 1.9) HTTP, HTTPS and APIs

<details open>
<summary>Table of Contents</summary>
<br>

[HTTP](#h1)

[HTTP Session](#h2)

[HTTP Request methods](#h3)

[Status codes](#h4)

[Example Session](#h5)

[HTTPS](#h6)

[Difference between HTTP and HTTPS](#h7)

[HTTPS Server setup](#h8)

[Acquiring certificates](#h9)

[APIs](#h10)

[Remote APIs](#h11)

[USEFULL LINKS](#h12)

</details>

<a name="h1"/>

**HTTP:**

The Hypertext Transfer Protocol (HTTP) is an application protocol for distributed, collaborative, hypermedia information systems. HTTP is the foundation of data communication for the World Wide Web, where hypertext documents include hyperlinks to other resources that the user can easily access, for example by a mouse click or by tapping the screen in a web browser. HTTP was developed to facilitate hypertext and the World Wide Web.

HTTP functions as a request–response protocol in the client–server computing model. A web browser, for example, may be the client and an application running on a computer hosting a website may be the server:
* The client submits an HTTP request message to the server. 
* The server, which provides resources such as HTML files and other content, or performs other functions on behalf of the client, returns a response message to the client. 
* The response contains completion status information about the request and may also contain requested content in its message body.

HTTP resources are identified and located on the network by Uniform Resource Locators (URLs), using the Uniform Resource Identifiers (URI's) schemes http and https. For example, including all optional components:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/URI.png)

URIs are encoded as hyperlinks in HTML documents, so as to form interlinked hypertext documents.

<a name="h2"/>

**HTTP Session:**

An HTTP session is a sequence of network request-response transactions. An HTTP client initiates a request by establishing a Transmission Control Protocol (TCP) connection to a particular port on a server (typically port 80, occasionally port 8080). An HTTP server listening on that port waits for a client's request message. Upon receiving the request, the server sends back a status line, such as "HTTP/1.1 200 OK", and a message of its own. The body of this message is typically the requested resource, although an error message or other information may also be returned.

<a name="h3"/>

**HTTP Request methods:**

* **GET:**

The GET method requests a representation of the specified resource. Requests using GET should only retrieve data and should have no other effect.

* **HEAD:**

The HEAD method asks for a response identical to that of a GET request, but without the response body. This is useful for retrieving meta-information written in response headers, without having to transport the entire content.

* **POST:**

The POST method requests that the server accept the entity enclosed in the request as a new subordinate of the web resource identified by the URI. The data POSTed might be, for example, an annotation for existing resources; a message for a bulletin board, newsgroup, mailing list, or comment thread; a block of data that is the result of submitting a web form to a data-handling process; or an item to add to a database.

* **PUT:**

The PUT method requests that the enclosed entity be stored under the supplied URI. If the URI refers to an already existing resource, it is modified; if the URI does not point to an existing resource, then the server can create the resource with that URI.

* **DELETE:**

The DELETE method deletes the specified resource.

* **TRACE:**

The TRACE method echoes the received request so that a client can see what (if any) changes or additions have been made by intermediate servers.

* **OPTIONS:**

The OPTIONS method returns the HTTP methods that the server supports for the specified URL. This can be used to check the functionality of a web server by requesting '*' instead of a specific resource.

* **CONNECT:**

The CONNECT method converts the request connection to a transparent TCP/IP tunnel, usually to facilitate SSL-encrypted communication (HTTPS) through an unencrypted HTTP proxy. See HTTP CONNECT method.

* **PATCH:**

The PATCH method applies partial modifications to a resource.


All general-purpose HTTP servers are required to implement at least the GET and HEAD methods, and all other methods are considered optional by the specification.

<a name="h4"/>

**Status codes:**

In HTTP/1.0 and since, the first line of the HTTP response is called the status line and includes a numeric status code (such as "404") and a textual reason phrase (such as "Not Found"). The way the user agent handles the response depends primarily on the code, and secondarily on the other response header fields. Custom status codes can be used, for if the user agent encounters a code it does not recognize, it can use the first digit of the code to determine the general class of the response:

* Informational 1XX
* Successful 2XX
* Redirection 3XX
* Client Error 4XX
* Server Error 5XX

<a name="h5"/>

**Example Session:**

In order to test HTTP requests, we can use the website:

https://reqbin.com/

Just select the request method and the host and click on "Send":

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/HTTP1.png)

The response will be displayed as:

![alt text](https://raw.githubusercontent.com/guidias1212/road_to_fullstack/master/images/HTTP2.png)

<a name="h6"/>

**HTTPS:**

Hypertext Transfer Protocol Secure (HTTPS) is an extension of the Hypertext Transfer Protocol (HTTP). It is used for secure communication over a computer network, and is widely used on the Internet. In HTTPS, the communication protocol is encrypted using Transport Layer Security (TLS), or, formerly, its predecessor, Secure Sockets Layer (SSL). The protocol is therefore also often referred to as HTTP over TLS,[3] or HTTP over SSL.

<a name="h7"/>

**Difference between HTTP and HTTPS:**

HTTPS URLs begin with "https://" and use port 443 by default, whereas HTTP URLs begin with "http://" and use port 80 by default.

HTTP is not encrypted and is vulnerable to man-in-the-middle and eavesdropping attacks, which can let attackers gain access to website accounts and sensitive information, and modify webpages to inject malware or advertisements. HTTPS is designed to withstand such attacks and is considered secure against them (with the exception of older, deprecated versions of SSL).

<a name="h8"/>

**HTTPS Server setup:**

To prepare a web server to accept HTTPS connections, the administrator must create a public key certificate for the web server. This certificate must be signed by a trusted certificate authority for the web browser to accept it without warning. The authority certifies that the certificate holder is the operator of the web server that presents it. Web browsers are generally distributed with a list of signing certificates of major certificate authorities so that they can verify certificates signed by them.

<a name="h9"/>

**Acquiring certificates:**

A number of commercial certificate authorities exist, offering paid-for SSL/TLS certificates of a number of types, including Extended Validation Certificates.

Let's Encrypt, launched in April 2016, provides free and automated service that delivers basic SSL/TLS certificates to websites. According to the Electronic Frontier Foundation, "Let's Encrypt" will make switching from HTTP to HTTPS "as easy as issuing one command, or clicking one button." The majority of web hosts and cloud providers now leverage Let's Encrypt, providing free certificates to their customers.

<a name="h10"/>

**APIs:**

In computer programming, an **application programming interface** (API) is a set of subroutine definitions, communication protocols, and tools for building software. In general terms, it is a set of clearly defined methods of communication among various components. A good API makes it easier to develop a computer program by providing all the building blocks, which are then put together by the programmer.

Documentation for the API usually is provided to facilitate usage and implementation.

* Purpose:

In building applications, an API simplifies programming by abstracting the underlying implementation and only exposing objects or actions the developer needs. While a graphical interface for an email client might provide a user with a button that performs all the steps for fetching and highlighting new emails, an API for file input/output might give the developer a function that copies a file from one location to another without requiring that the developer understand the file system operations occurring behind the scenes.

<a name="h11"/>

**Remote APIs:**

Remote APIs allow developers to manipulate remote resources through protocols, specific standards for communication that allow different technologies to work together, regardless of language or platform. For example, the Java Database Connectivity API allows developers to query many different types of databases with the same set of functions, while the Java remote method invocation API uses the Java Remote Method Protocol to allow invocation of functions that operate remotely, but appear local to the developer.

Therefore, remote APIs are useful in maintaining the object abstraction in object-oriented programming; a method call, executed locally on a proxy object, invokes the corresponding method on the remote object, using the remoting protocol, and acquires the result to be used locally as return value.

A modification on the proxy object also will result in a corresponding modification on the remote object.

<a name="h12"/>

**USEFULL LINKS**

**HTTP History and information:**

https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol

**List of status codes:**

https://en.wikipedia.org/wiki/List_of_HTTP_status_codes

**Post HTTP requests online:**

https://reqbin.com/

**HTTPS History and information:**

https://en.wikipedia.org/wiki/HTTPS

**Lets Encrypt:**

https://letsencrypt.org/

**APIs History and information:**

https://en.wikipedia.org/wiki/Application_programming_interface