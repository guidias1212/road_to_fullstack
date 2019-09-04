import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class ListOfCollection { 
   
   public static void main( String args[] ) {  
      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 

      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser", "myDb", 
         "password".toCharArray()); 

      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("myDb"); 
      
      //Creating collections 
      database.createCollection("sampleCollection_1"); 
      database.createCollection("sampleCollection_2"); 
      database.createCollection("sampleCollection_3"); 
      database.createCollection("sampleCollection_4"); 
      database.createCollection("sampleCollection_5"); 
      System.out.println("Collections created successfully"); 
      
      for (String name : database.listCollectionNames()) { 
         System.out.println(name); 
      } 
   }
} 