# 3.3.1.7) Practical Tests

Practical Unit and Integration tests added to the first package distribution **Get IP Location App**.

<details open>
<summary>Table of Contents</summary>
<br>

[Methods List](#h1)

[Unit Tests](#h2)

[Integration Tests](#h3)

[USEFUL LINKS](#h4)

</details>

<a name="h1"/>

**Methods List:**

* **findIP(String IPline):** Method to extract the ipv4 sub string from string.
* **getIPs(String domain):** Method that calls the tracert command from windows, passing a domain as an argument.
* **getLocations(ArrayList<String> ip_list, String api_key):** Method that gets the geolocations via public API from each passed ip.
* **convertToHashMap(String location):** Method that gets a String line (Response from API) and converts it to a Map, for better dealing with the results.
* **actionPerformed(ActionEvent arg0):** Set action that should be done when the submit button is pressed.

<a name="h2"/>

**Unit Tests:**

In order to test each method from the application, the Unit test was applied:

findIP:
```
// Test findIP method:
	@Test
	void test_findIP() {
		
		// Create a mock object:
		String mock = "This is a String line with an IP sample: 1.1.1.1";
		
		// Compare result with a known value:
		Assert.assertEquals("1.1.1.1", GetLocation.findIP(mock));
	}
```

getIPs:
```
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
```

getLocations:
```
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
```

convertToHashMap:
```
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
```

<a name="h3"/>

**Integration Tests:**

For the integration test, the full usage of the application was tested:
```
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
```

<a name="h4"/>

**USEFUL LINKS**

**Get IP Location App:**

https://github.com/guidias1212/Get-IP-Location-App