# 3.3.1.8.2) MySQL

MySQL is an open-source relational database management system (RDBMS). Its name is a combination of "My", the name of co-founder Michael Widenius's daughter, and "SQL", the abbreviation for Structured Query Language.

**Setup: Connect Java to a MySQL database**

Here's a step by step explanation how to install MySQL and JDBC and how to use it:

**1)**Download and install the MySQL server. Just do it the usual way. Remember the port number whenever you've changed it. It's by default 3306.

https://dev.mysql.com/downloads/mysql/

**2)** Put the JDBC driver containing JAR file in the classpath. It is located by default in C:\Program Files (x86)\MySQL\Connector J 8.0.

If you're using an IDE like Eclipse or Netbeans, then you can add it to the classpath by adding the JAR file as Library to the Build Path in project's properties.

If you're doing it "plain vanilla" in the command console, then you need to specify the path to the JAR file in the -cp or -classpath argument when executing your Java application.
```
java -cp .;/path/to/mysql-connector.jar com.example.YourClass
```

**3)** Create a database in MySQL. Let's create a database javabase:

In MySQL Workbench, create a new SQL tab for executing queries and run:
```
CREATE DATABASE javabase DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
```

**4)** Create an user for Java and grant it access:
```
CREATE USER 'java'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON javabase.* TO 'java'@'localhost' IDENTIFIED BY 'password';
```

java is the username and password is the password here.

**5)** Determine the JDBC URL. To connect the MySQL database using Java you need an JDBC URL in the following syntax:
```
jdbc:mysql://hostname:port/databasename
```

Where:

* hostname: The hostname where MySQL server is installed. If it's installed at the same machine where you run the Java code, then you can just use localhost. It can also be an IP address like 127.0.0.1. If you encounter connectivity problems and using 127.0.0.1 instead of localhost solved it, then you've a problem in your network/DNS/hosts config.

* port: The TCP/IP port where MySQL server listens on. This is by default 3306.

* databasename: The name of the database you'd like to connect to. That's javabase.

So the final URL should look like:
```
jdbc:mysql://localhost:3306/javabase
```

**6)** Test the connection to MySQL using Java. Create a simple Java class with a main() method to test the connection.
```
String url = "jdbc:mysql://localhost:3306/javabase";
String username = "java";
String password = "password";

System.out.println("Connecting database...");

try (Connection connection = DriverManager.getConnection(url, username, password)) {
    System.out.println("Database connected!");
} catch (SQLException e) {
    throw new IllegalStateException("Cannot connect the database!", e);
}
```

**7)** Execute a simple query on the Database sample:
```
//This is a script to execute a simple query on a MySQL Database.

import java.sql.*;

public class QueryTests {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/world?useTimezone=true&serverTimezone=UTC";
		String username = "java";
		String password = "password";
		
		System.out.println("Connecting database...");

		try {
			Connection conn = DriverManager.getConnection(url, username, password);
      
			// SQL SELECT query. 
			// If you only need a few columns, specify them by name instead of using "*"
			String query = "SELECT * FROM city";

			// Create the java statement
			Statement st = conn.createStatement();
      
			// Execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset (If you don't know the column names, check below:)
			while (rs.next()) {
				
				Integer id = rs.getInt("ID");
				String Name = rs.getString("Name");
				String CountryCode = rs.getString("CountryCode");
				String District = rs.getString("District");
				String Population = rs.getString("Population");
				
				// print the results
				System.out.format("%s, %s, %s, %s %s\n", id, Name, CountryCode, District, Population);
			}
			
			// If you need to get metadata from your result set, uncomment and execute the script below (Get column names, for example):
			/*
			ResultSetMetaData metaData = rs.getMetaData();
			int count = metaData.getColumnCount();
			String columnName[] = new String[count];

			for (int i = 1; i <= count; i++)
			{
			   columnName[i-1] = metaData.getColumnLabel(i);
			   System.out.println(columnName[i-1]);
			}
			*/

			st.close();
		}
		catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}
}
```

**USEFULL LINKS**

**Installation and Setup (Java):**

https://stackoverflow.com/questions/2839321/connect-java-to-a-mysql-database

**MySQL Tutorial:**

http://www.mysqltutorial.org/

**MySQL Workbench Documentation:**

https://dev.mysql.com/doc/workbench/en/

**History:**

https://en.wikipedia.org/wiki/MySQL
