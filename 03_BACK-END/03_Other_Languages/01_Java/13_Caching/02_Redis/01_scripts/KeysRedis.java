
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