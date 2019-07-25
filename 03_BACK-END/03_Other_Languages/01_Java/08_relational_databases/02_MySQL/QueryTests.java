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