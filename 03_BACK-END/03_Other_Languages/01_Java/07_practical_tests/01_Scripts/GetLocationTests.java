import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetLocationTests {
	
	// Testing API key:
	String api_key = "69dc6c34e2b4485abffc224981a5c4d7";
	
	@BeforeEach
	void setUp() throws Exception {
		
		// Set the GUI up:
		GetLocation.setupGUI();
	}

	// Test findIP method:
	@Test
	void test_findIP() {
		
		// Create a mock object:
		String mock = "This is a String line with an IP sample: 1.1.1.1";
		
		// Compare result with a known value:
		Assert.assertEquals("1.1.1.1", GetLocation.findIP(mock));
	}
	
	// Test getIPs method:
	@Test
	void test_getIPs() {
		
		// Local host IP:
		String localHost = "127.0.0.1";
		
		// Create a comparison object:
		ArrayList<String> comparison = new ArrayList<String>();
		comparison.add("");
		comparison.add("127.0.0.1");
		comparison.add("");
		comparison.add("");
		comparison.add("127.0.0.1");
		comparison.add("");
		comparison.add("");
		
		// Compare result with a known value:
		Assert.assertEquals(comparison, GetLocation.getIPs(localHost));
	}
	
	// Test getLocations method (Compared first 10 characteres of String, because API results also retrieves current time):
	@Test
	void test_getLocations() {
		
		// Create a mock object:
		ArrayList<String> mock = new ArrayList<String>();
		mock.add("1.1.1.1");
		
		// Create a comparison object:
		ArrayList<String> comparison = new ArrayList<String>();
		comparison.add("{\"ip\":\"1.1.1.1\",\"continent_code\":\"OC\",\"continent_name\":\"Oceania\",\"country_code2\":\"AU\",\"country_code3\":\"AUS\",\"country_name\":\"Australia\",\"country_capital\":\"Canberra\",\"state_prov\":\"Queensland\",\"district\":\"South Brisbane\",\"city\":\"Brisbane\",\"zipcode\":\"4101\",\"latitude\":\"-27.47480\",\"longitude\":\"153.01700\",\"is_eu\":false,\"calling_code\":\"+61\",\"country_tld\":\".au\",\"languages\":\"en-AU\",\"country_flag\":\"https://ipgeolocation.io/static/flags/au_64.png\",\"isp\":\"Cloudflare, Inc.\",\"connection_type\":\"\",\"organization\":\"\",\"geoname_id\":\"2207259\",\"currency\":{\"code\":\"AUD\",\"name\":\"Australian Dollar\",\"symbol\":\"A$\"},\"time_zone\":{\"name\":\"Australia/Brisbane\",\"offset\":10,\"current_time\":\"2019-08-05 23:17:28.445+1000\",\"current_time_unix\":1565011048.445,\"is_dst\":false,\"dst_savings\":0}}");
		
		// Get first line of comparison:
		String parcial_comparison = comparison.get(0);
		
		// Get first 10 characteres of the result:
		parcial_comparison = parcial_comparison.substring(0, 10);
		
		// Get the method result:
		ArrayList<String> result = GetLocation.getLocations(mock, api_key);
		
		// Get first line of result:
		String parcial_result = result.get(0);
		
		// Get first 10 characteres of the result:
		parcial_result = parcial_result.substring(0, 10);
		
		// Compare characteres with a known value:
		Assert.assertEquals(parcial_comparison, parcial_result);
	}
	
	// Test convertToHashMap method:
	@Test
	void test_convertToHashMap() {
		
		// Create a mock object:
		String mock = "\"ip\":\"1.1.1.1\",\"continent_code\":\"OC\"";
		
		// Create a comparison object:
		Map<String,String> ip_map = new HashMap<>(); 
	    ip_map.put("ip", "1.1.1.1");
	    ip_map.put("continent_code", "OC");
		
	    // Compare result with a known value:
	    Assert.assertEquals(ip_map, GetLocation.convertToHashMap(mock));
	}
	
	
	// Integration test: actionPerformed (submit button) method:
	@Test
	void test_actionPerformed() {
		
		// Instantiate GUI mocking objects:
		
		// Get the destination text field component:
		JTextField websiteField = GetLocation.getPackDestTextField();
		
		// Get the API key text field component:
		JTextField apiKeyField = GetLocation.getApiKeyTextField();

		// Get the GUI submit button component:
		JButton button = GetLocation.getSubmitButton();

		// Setup GUI mocking objects:
		websiteField.setText("1.1.1.1");
		apiKeyField.setText(api_key);
		
		// Click on submit button:
		button.doClick();
		
		// Get the result when the button is clicked:
		JList<String> response = GetLocation.getResponseList();
		
		// Count the amount of components in result list:
		int resultsCount = response.getModel().getSize();
		
		// Compare results before and after button click:
		Assert.assertEquals(14, resultsCount);
	}

}
