//Script to test date and time in Java

//Import the LocalDate class:
import java.time.LocalDate; 
//Import the LocalTime class:
import java.time.LocalTime;
//Import the LocalDateTime class:
import java.time.LocalDateTime;
//Import the DateTimeFormatter class
import java.time.format.DateTimeFormatter;

public class DateTimeTests { 
  public static void main(String[] args) { 
	
	//DATE
	//Create a date object:
    LocalDate dateObj = LocalDate.now();
	//Display the current date:
	System.out.println("Date:"); 
    System.out.println(dateObj);
	
	//TIME
	//Create a time object:
	LocalTime timeObj = LocalTime.now();
	//Display the current time:
	System.out.println("Time:"); 
    System.out.println(timeObj);
	
	//DATETIME
	//Create a datetime object:
	LocalDateTime datetimeObj = LocalDateTime.now();
	//Display the current datetime:
	System.out.println("DateTime:"); 
    System.out.println(datetimeObj);
	
	
	//DATETIME Formatting
	//Create a datetime object:
	LocalDateTime datetimeObj2 = LocalDateTime.now(); 
    System.out.println("Before formatting: " + datetimeObj2); 
	//Create a format pattern object:
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	//Format previous datetime object:
    String formattedDateTime = datetimeObj2.format(myFormatObj); 
    System.out.println("After formatting: " + formattedDateTime); 
	
  } 
}