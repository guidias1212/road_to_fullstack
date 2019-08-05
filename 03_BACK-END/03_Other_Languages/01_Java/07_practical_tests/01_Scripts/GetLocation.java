import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GetLocation {
	
	// Create GUI frame:
	private static JFrame frame = new JFrame("Get Location App");
	
	// Create a panel to hold components:
	private static JPanel panel = new JPanel();
	
	// Create the "Package destination: " label:
	private static JLabel packDestLabel = new JLabel("Package destination: ");
	
	// Create a text field that will receive the package destination String from the user:
	private static JTextField packDestTextField = new JTextField("",10);
	
	// Create the "API Key: " label:
	private static JLabel apiKeyLabel = new JLabel("API Key: ");
	
	// Create a text field that will receive the API Key from the user:
	private static JTextField apiKeyTextField = new JTextField("",25);
	
	// Create the submit button:
	private static JButton submitButton = new JButton("Submit");
	
	// Create a response label to give information to the user:
	private static JLabel responseLabel = new JLabel();
	
	// Create a list to receive the response:
	private static JList<String> responseList;
	
	// Create a scroll pane to receive the response list:
	private static JScrollPane scroll = new JScrollPane();
	
	// Method that sets all GUI components up:
	public static void setupGUI() {
		
		// Set default action when user closes the frame:
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the frame layout:
		frame.getContentPane().setLayout(new BorderLayout());
		
		// Set the panel layout:
		panel.setLayout(new FlowLayout());
		
		// Add user interaction components to panel:
		panel.add(packDestLabel);
		panel.add(packDestTextField);
		panel.add(apiKeyLabel);
		panel.add(apiKeyTextField);  
		panel.add(submitButton);
		
		// Add remaining components to main frame:
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(responseLabel, BorderLayout.CENTER);
		frame.getContentPane().add(scroll, BorderLayout.SOUTH);
		
		// Set the frame size:
		frame.setSize(800,300); 
		
		// Set a listener to the Button:
		submitButton.addActionListener(new ActionListener() {
	        
			// Set action that should be done when the submit button is pressed:
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				// Set the website variable as the user input text "Package Destination":
				String website = packDestTextField.getText();
				
				// Set the api variable as the user input text "API Key":
				String api_key = apiKeyTextField.getText();
				
				// Change the responseLabel text:
				responseLabel.setText("IP  /  City  /  Country  /  ISP  /  Organization");
				
				// Get each IP from the devices, calling the Windows tracert command:
				ArrayList<String> ip_path = getIPs(website);
				
				// Get the geolocation and information from each IP using the API:
				ArrayList<String> locations = getLocations(ip_path, api_key);
				
				// Create an ArrayList that will hold the results:
				ArrayList<String> results = new ArrayList<String>();
				
				// Loop through each String response from the API:
				for (String location : locations) {
					
					// Convert each String to a Hashmap:
		    		Map<String,String> map = convertToHashMap(location);
		    		
		    		// Add desired information to results variable (Other results could be added here:
		    		results.add(
		    				map.get("ip") + "    " +
				    		map.get("city") + "    " +
				    		map.get("country_name") + "    " +
				    		map.get("isp") + "    " +
				    		map.get("organization")
		    				);	    		
		    	}
				
				// Convert ArrayList<String> to String[]
				String[] locationsArray = results.toArray(new String[0]);
				
				// Create a list to display the response:
				responseList = new JList<String>(locationsArray);
				
				// Update response list:
				scroll.getViewport().add(responseList);
			}          
	      });
		
	}
	
	// Method that starts the GUI:
	public static void startGUI() {
		
		// Make the frame visible:
		frame.setVisible(true);
	}
	
	// Method to get the package destination TextField:
	public static JTextField getPackDestTextField() {
		return packDestTextField;
	}
	
	// Method to get the API Key TextField:
	public static JTextField getApiKeyTextField() {
		return apiKeyTextField;
	}
	
	// Method to get the submit button:
	public static JButton getSubmitButton() {
		return submitButton;
	}
	
	// Method to get the scroll pane:
	public static JScrollPane getScroll() {
		return scroll;
	}
	
	// Method to get the response list:
	public static JList<String> getResponseList() {
		return responseList;
	}
	
	// Method to extract the ipv4 sub string from string:
	public static String findIP(String IPline) {
		
		// Create an IP String variable:
		String ip_string = "";
		
		// Create a Pattern variable that defines the IP pattern using REGEX:
		Pattern MY_PATTERN = Pattern.compile("\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b");
		
		// Match IP pattern from string argument to find IP String on the message:
		Matcher m = MY_PATTERN.matcher(IPline);
		
		// Find IP String in message line:
		while (m.find()) {
			
			// Group String found:
			ip_string = m.group(0);
		}
		
		// Return isolated IP String:
		return ip_string;
	}
	
	// Method that calls the tracert command from windows, passing a domain as an argument:
	public static ArrayList<String> getIPs(String domain) {
		
		// Create a Process variable that will execute the cmd commands on Windows:
		Process p;
		
		// Create a String variable that will hold the retrieved String line from Windows cmd:
		String line;
		
		// Create an ArrayList variable that will hold each line of the retrieved message from Windows cmd:
		ArrayList<String> ip_lines = new ArrayList<String>();
		
		// Create an ArrayList variable that will hold each isolated IP String:
    	ArrayList<String> ip_list = new ArrayList<String>();
    	
    	// Open a Try/Catch block to prevent the program from breaking:
	    try {
	    	
	    	// Execute the cmd command on Windows:
	        p = Runtime.getRuntime().exec("cmd /c tracert " + domain);
	        
	        // Wait for the command to be completed:
	        p.waitFor(); 
	        
	        //Read the response from cmd:
	        BufferedReader reader=new BufferedReader(new InputStreamReader(
	        		
	        	// Get the response:
	        	p.getInputStream())); 
	        
	        	// Read each line from the response until the last line (null):
	        	while((line = reader.readLine()) != null) { 
	        		
	        		// Add each response line to the ArrayList variable:
	        		ip_lines.add(line);
	        	}
	        	
	        // Catch error message if something goes wrong:
	    	} catch (IOException e) {
	    		
	    		//Print error:
	    		e.printStackTrace();
	    		
	    	// Catch error message if something goes wrong:
	    	} catch (InterruptedException e) {
	    		
	    		//Print error:
	    		e.printStackTrace();
	    	}
	    
	    	// Loop through each Windows response line:
		    for (String ip_line : ip_lines) {
		    	
		    	// Find the IP inside the String and add it to ip_list:
		    	ip_list.add(findIP(ip_line));
	    	}
		    
		    // Return the list of IP Strings:
	    	return ip_list;
	}
	
	// Method that gets the geolocations via public API from each passed ip:
	public static ArrayList<String> getLocations(ArrayList<String> ip_list, String api_key) {
		
		// Create a line String that will hold each String line received from the geolocation API:
		String line;
		
		// Create an ArrayList variable that will hold the output from each API response for each IP:
		ArrayList<String> output = new ArrayList<String>();
		
		// Loop through IP list:
		for (String ip : ip_list) {
			
			 // Open a Try/Catch block to prevent the program from breaking:
			 try {
				 
				 // Create an URL variable that setups the API connection with given API key and IP:
		         URL url = new URL("https://api.ipgeolocation.io/ipgeo?apiKey="+api_key+"&ip="+ip);
		         
		         // Connect to the API:
		         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		         
		         // Set API request method:
		         conn.setRequestMethod("GET");
		         
		         // Set API request properties:
		         conn.setRequestProperty("Accept", "application/json");
		         
		         // Do something if the API response code is 423 (Bogon IP address):
		         if (conn.getResponseCode() == 423) {
		        	 
		        	 // The most common error here is because the IP requested is private:
		        	 throw new RuntimeException("Private IP adress.");
		        
		         // Do something if the API response code is not 200 (OK):
		         } else if (conn.getResponseCode() != 200) {
		        	 
		        	 // Throw error message:
		        	 throw new RuntimeException("Server response is not 200, something wrong happened.");
		         }
		         
		         // Create an InputStreamReader object to input the API response:
		         InputStreamReader in = new InputStreamReader(conn.getInputStream());
		         
		         // Create a BufferedReader to read the API response:
		         BufferedReader br = new BufferedReader(in);
		         
		         // Loop through each line from API response until the last line (null):
		         while ((line = br.readLine()) != null) {
		        	 
		        	 // Add each line to the output variable:
		        	 output.add(line);
		         }
		         
		         // Disconnect from the API:
		         conn.disconnect();
		         
		         // Catch any errors during the process:
		         } catch (Exception e) {
		         }
		}
		
		// Return the API response:
		return output;
	}
	
	// Method that gets a String line (Response from API) and converts it to a Map, for better dealing with the results:
	public static Map<String,String> convertToHashMap(String location){
		
		// Remove String brackets:
		location = location.substring(1, location.length()-1);
		
		// Split the string to create key-value pairs:
		String[] keyValuePairs = location.split("\",\"");
		
		// Create Map object:
		Map<String,String> ip_map = new HashMap<>(); 
		
		// Iterate over the pairs:
		for(String pair : keyValuePairs)
		{	
			
			// Remove " :
			pair = pair.replace( '"', ' ' );
			
			// Split the pairs to get key and value:
		    String[] entry = pair.split(":");
		    
		    // Add them to the hashmap and trim whitespaces:
		    ip_map.put(entry[0].trim(), entry[1].trim());
		}
		
		// Return the Map with each Key-Value pair from the API response:
		return ip_map;
	}
	
	// Main method to run a program in Java:
    public static void main(String[] args) {
    	
    	// Set the GUI components up:
    	setupGUI();
    	
    	// Start the GUI with predefined setup:
    	startGUI();
    	
    }
}