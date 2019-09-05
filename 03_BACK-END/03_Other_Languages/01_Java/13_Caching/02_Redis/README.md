# 3.3.1.13.2) Redis

Redis (Remote Dictionary Server) is an in-memory data structure project implementing a distributed, in-memory key-value database with optional durability. Redis supports different kinds of abstract data structures, such as strings, lists, maps, sets, sorted sets, HyperLogLogs, bitmaps, streams, and spatial indexes. The project is mainly developed by Salvatore Sanfilippo and as of 2019, is sponsored by Redis Labs.It is open-source software released under a BSD 3-clause license.

<details open>
<summary>Table of Contents</summary>
<br>

[Connect to Redis Server](#h1)

[Redis String Example](#h2)

[Redis List Example](#h3)

[Redis Keys Example](#h4)

[USEFUL LINKS](#h5)

</details>

<a name="h1"/>

**Connect to Redis Server:**

After setting up your Redis environment, to connect see the following:
```
import redis.clients.jedis.Jedis; 

public class RedisJava { 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      //check whether server is running or not 
      System.out.println("Server is running: "+jedis.ping()); 
   } 
} 
```

The result should be:
```
Connection to server sucessfully
Server is running: PONG
```

<a name="h2"/>

**Redis String Example:**

Storing a String:
```
import redis.clients.jedis.Jedis; 

public class StringRedis { 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      //set the data in redis string 
      jedis.set("tutorial-name", "Redis tutorial"); 
      // Get the stored data and print it 
      System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name")); 
   } 
}
```

The result should be:
```
Connection to server sucessfully
Stored string in redis:: Redis tutorial
```

<a name="h3"/>

**Redis List Example:**

Storing a List:
```
import java.util.List;

import redis.clients.jedis.Jedis; 

public class ListRedis { 
   public static void main(String[] args) { 
   
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      
      //store data in redis list 
      jedis.lpush("tutorial-list", "Redis"); 
      jedis.lpush("tutorial-list", "Mongodb"); 
      jedis.lpush("tutorial-list", "Mysql"); 
      // Get the stored data and print it 
      List<String> list = jedis.lrange("tutorial-list", 0 ,5); 
      
      for(int i = 0; i<list.size(); i++) { 
         System.out.println("Stored string in redis:: "+list.get(i)); 
      } 
   } 
} 
```

The result should be:
```
Connection to server sucessfully
Stored string in redis:: Mysql
Stored string in redis:: Mongodb
Stored string in redis:: Redis
```

<a name="h4"/>

**Redis Keys Example:**

Reading Available Keys:
```

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis; 

public class KeysRedis { 
   public static void main(String[] args) { 
   
      //Connecting to Redis server on localhost:
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      
    //set the data in redis string 
      jedis.set("tutorial-name", "Redis tutorial"); 
      
      //store data in redis list:
      jedis.lpush("tutorial-list", "Redis"); 
      jedis.lpush("tutorial-list", "Mongodb"); 
      jedis.lpush("tutorial-list", "Mysql"); 
      
      // Get the stored data and print it:
      Set<String> sourceSet = jedis.keys("*"); 
      List<String> list = new ArrayList<>(sourceSet);
      
      for(int i = 0; i<list.size(); i++) { 
         System.out.println("List of stored keys:: "+list.get(i)); 
      } 
   } 
}
```

The result should be:
```
Connection to server sucessfully
List of stored keys:: tutorial-name
List of stored keys:: tutorial-list
```

<a name="h5"/>

**USEFUL LINKS**

**Redis Wikipedia:**

https://en.wikipedia.org/wiki/Redis

**Redis Website:**

https://redis.io/

**Download Redis for Windows:**

https://github.com/rgl/redis/downloads

**Start Redis Server:**

https://stackoverflow.com/questions/42857551/could-not-connect-to-redis-at-127-0-0-16379-connection-refused-with-homebrew

**Redis tutorial:**

https://www.tutorialspoint.com/redis/index.htm