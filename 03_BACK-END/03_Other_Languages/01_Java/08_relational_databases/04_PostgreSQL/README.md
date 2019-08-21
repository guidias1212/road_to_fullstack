# 3.3.1.8.4) PostgreSQL

PostgreSQL is a powerful, open source object-relational database system with over 30 years of active development that has earned it a strong reputation for reliability, feature robustness, and performance.

<details open>
<summary>Table of Contents</summary>
<br>

[Setup: Connect Java to a PostgreSQL database](#h1)

[USEFULL LINKS](#h2)

</details>

<a name="h1"/>

**Setup: Connect Java to a PostgreSQL database**

Here's a step by step explanation how to install PostgreSQL and JDBC and how to use it:

**1)** Download and install the PostgreSQL server. Just do it the usual way. Remember the port number whenever you've changed it. It's by default 5432.

https://www.postgresql.org/download/windows/

**2)** Install the JDBC driver containing JAR files using the setup wizard.

If you're using an IDE like Eclipse or Netbeans, then you can add it to the classpath by adding the JAR file as Library to the Build Path in project's properties.

If you're doing it "plain vanilla" in the command console, then you need to specify the path to the JAR file in the -cp or -classpath argument when executing your Java application.
```
java -cp .;/path/to/postgreSQL_jdbc.jar com.example.YourClass
```

**3)** Create a database in PostgreSQL. Just create a database "testdb" using the intuitive GUI "pgAdmin".

**4)** On "pgAdmin" GUI, create an user for Java and grant it access.

**5)** Determine the JDBC URL. To connect the PostgreSQL database using Java you need an JDBC URL in the following syntax:
```
jdbc:postgresql://hostname:port/databasename
```

Where:

* hostname: The hostname where PostgreSQL server is installed. If it's installed at the same machine where you run the Java code, then you can just use localhost. It can also be an IP address like 127.0.0.1. If you encounter connectivity problems and using 127.0.0.1 instead of localhost solved it, then you've a problem in your network/DNS/hosts config.

* port: The TCP/IP port where PostgreSQL server listens on. This is by default 5432.

* databasename: The name of the database you'd like to connect to.

**6)** Test the connection to PostgreSQL using Java. Create a simple Java class with a main() method to test the connection.
```
import java.sql.Connection;
import java.sql.DriverManager;

public class TestPostgreSQL {
   public static void main(String args[]) {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/testdb",
            "java_user", "admin");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
}
```

**7)** Execute a simple query on the Database sample:
```
// This is a script to execute a simple query on a PostgreSQL database.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatePostgreSQLTable {
   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/testdb",
            "java_user", "admin");
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = "CREATE TABLE COMPANY " +
            "(ID INT PRIMARY KEY     NOT NULL," +
            " NAME           TEXT    NOT NULL, " +
            " AGE            INT     NOT NULL, " +
            " ADDRESS        CHAR(50), " +
            " SALARY         REAL)";
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   }
}
```

<a name="h2"/>

**USEFULL LINKS**

**PostgreSQL site:**

https://www.postgresql.org/

**PostgreSQL windows:**

https://www.postgresql.org/download/windows/

**Installation and Setup (Java):**

https://www.tutorialspoint.com/postgresql/postgresql_java
