//Script to test working with Files.

//Import the File class:
import java.io.File;
//Import the FileWriter class:
import java.io.FileWriter;
//Import the Scanner class to read text files:
import java.util.Scanner; 
//Import the IOException class to handle errors:
import java.io.IOException;
//Import this class to handle errors:
import java.io.FileNotFoundException;  


public class FilesTests { 
  public static void main(String[] args) { 
  
	//Creating a file:
	File myObj = new File("test_file.txt"); 
    try { 
      if (myObj.createNewFile()) { 
        System.out.println("File created: " + myObj.getName()); 
      } else { 
        System.out.println("File already exists."); 
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    }

	//Get File Information:
	if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName()); 
      System.out.println("Absolute path: " + myObj.getAbsolutePath()); 
      System.out.println("Writeable: " + myObj.canWrite()); 
      System.out.println("Readable " + myObj.canRead()); 
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }

	//Write to a File:
	try { 
      FileWriter myWriter = new FileWriter("test_file.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
	
	//Read a File:
	try {
      Scanner myReader = new Scanner(myObj); 
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  } 
}