# 3.3.1.13.1) Memcached

Memcached is a general-purpose distributed memory caching system. It is often used to speed up dynamic database-driven websites by caching data and objects in RAM to reduce the number of times an external data source (such as a database or API) must be read. Memcached is free and open-source software, licensed under the Revised BSD license. Memcached runs on Unix-like operating systems (at least Linux and OS X) and on Microsoft Windows. It depends on the libevent library.

<details open>
<summary>Table of Contents</summary>
<br>

[Overview](#h1)

[Connection and example](#h2)

[USEFUL LINKS](#h3)

</details>

<a name="h1"/>

**Overview:**

Memcached is an open source, high-performance, distributed memory caching system intended to speed up dynamic web applications by reducing the database load. It is a key-value dictionary of strings, objects, etc., stored in the memory, resulting from database calls, API calls, or page rendering.

The key features of Memcached are as follows:

* It is open source.

* Memcached server is a big hash table.

* It significantly reduces the database load

* It is perfectly efficient for websites with high database load.

* It is distributed under Berkeley Software Distribution (BSD) license.

* It is a client-server application over TCP or UDP.

Memcached is not:

* a persistent data store

* a database

* application-specific

* a large object cache

* fault-tolerant or highly available

**Difference between memcache vs. memcached:**

The short answer is: nothing. The longer answer is that, because memcache is executed in the background on Linux systems (and is thus considered a “daemon”), the program file used to start the software is named memcached to follow daemon naming conventions. So, technically, memcache refers to the software and memcached refers to the name of the program file. But most people simply use memcached to refer to both at this point.

<a name="h2"/>

**Connection and example (Couchbase Memcached Bucket):**

* Setup a Couchbase local server and a Memcached Bucket with Flush parameter set to "on".

* All stable releases of the Java SDK are primarily distributed through Maven. As a result the dependency can be included easily using your favorite package manager. For Maven itself, it typically looks like this:
```
<dependencies>
  <dependency>
    <groupId>com.couchbase.client</groupId>
    <artifactId>java-client</artifactId>
    <version>2.7.9</version>
  </dependency>
</dependencies>
```

The code snippet below shows how the Java SDK may be used for some common operations:
```
import com.couchbase.client.java.*;
import com.couchbase.client.java.document.*;
import com.couchbase.client.java.document.json.*;
import com.couchbase.client.java.query.*;

public class MemcachedExample {

    public static void main(String... args) throws Exception {

        // Initialize the Connection
        Cluster cluster = CouchbaseCluster.create("localhost");
        cluster.authenticate("Admin", "adminadmin");
        Bucket bucket = cluster.openBucket("MemcachedBucket");

        // Create a JSON Document
        JsonObject arthur = JsonObject.create()
            .put("name", "Arthur")
            .put("email", "kingarthur@couchbase.com")
            .put("interests", JsonArray.from("Holy Grail", "African Swallows"));

        // Store the Document
        bucket.upsert(JsonDocument.create("u:king_arthur", arthur));

        // Load the Document and print it
        // Prints Content and Metadata of the stored Document
        System.out.println(bucket.get("u:king_arthur"));

        // Perform a N1QL Query
        N1qlQueryResult result = bucket.query(
            N1qlQuery.parameterized("SELECT name FROM `bucketname` WHERE $1 IN interests",
            JsonArray.from("African Swallows"))
        );

        // Print each found Row
        for (N1qlQueryRow row : result) {
            // Prints {"name":"Arthur"}
            System.out.println(row);
        }
    }
}
```

<a name="h3"/>

**USEFUL LINKS**

**Memcached Website:**

https://memcached.org/

**Replacement of Memcached to Couchbase:**

https://www.couchbase.com/memcached-replacement

**Memcached Wikipedia:**

https://en.wikipedia.org/wiki/Memcached

**Memcached Tutorial:**

https://www.tutorialspoint.com/memcached/index.htm

**Memcached Setup:**

https://www.tutorialspoint.com/memcached/memcached_environment.htm

**Couchbase Setup to work as Memcached also setup for Windows:**

https://www.ubergizmo.com/how-to/install-memcached-windows/

**Couchbase example:**

https://docs.couchbase.com/java-sdk/current/start-using-sdk.html