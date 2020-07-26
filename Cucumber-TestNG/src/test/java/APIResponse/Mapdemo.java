package APIResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Mapdemo {

	private static String payload = "{\n" +
	        "  \"description\": \"Some Description\",\n" +
	        "  \"id\": \"Some id\",\n" +
	        "  \"name\": \"Some name\"\n" +
	        "}";
/*	
	{
		"id": "12",
		"checkDate": 1395093997218,
		"netAmount": {
		"amount": 70,
		"currency": "USD"
		},
		"moneyDistributionLineItems": [
		{
		"mAmount": 100,
		"employeeBankAccountId": "BankAccount 1"
		}
		],
		}*/

	
	public static void main(String[] args) throws ParseException {
		
		//1. jsonString to JSONObject in Java using JSON-Simple
		/*JSONParser parser = new JSONParser(); 
		JSONObject json = (JSONObject) parser.parse(payload);
        System.out.println(json);*/
		
        //2.Java object to JSON by using toJson()
		/*Address Address = new Address();
		Address.setCountry("india");
		Address.setStreet("williams street");
		Address.setPincode("603103");
		
		List<Address> list = new ArrayList<Address>();
		list.add(Address);
	
		Gson g =new Gson();
        String str = g.toJson(list);
        System.out.println(str);*/
      
        //3. jsonString to JSONObject in Java using Gson
       /* JsonObject obj = new JsonParser().parse(payload).getAsJsonObject();
        System.out.println(obj);*/
        
		  Map<String, Object> netAmount = new HashMap<String, Object>();
		  Map<String,String> map1 = new LinkedHashMap<String,String>();
		  map1.put("amount", "10");
		  map1.put("currency", "USD");
		  netAmount.put("netAmount", map1);
		  
		  Map<String, Object> mapObject = new HashMap<String, Object>();
		  mapObject.put("mAmount", 100);
		  mapObject.put("employeeBankAccountId", "BankAccount 1");
		  List<Object> list = new ArrayList<Object>();
		  list.add(mapObject);
		 
		Map<String, Object> hashmap = new HashMap<String, Object>();
		hashmap.put("moneyDistributionLineItems", list);
		hashmap.put("netAmount", map1);
		hashmap.put("id", "12");
		hashmap.put("checkDate", "1395093997218");
		  
	      Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
	      String jsonOutput = gson1.toJson(hashmap);
	      System.out.println(jsonOutput);
	    
/*		[
		  {
		    "firstName": "Vignesh",
		    "bookName": "Three Mistakes",
		    "auAge": 18,
		    "list": [
		      {
		        "country": "india",
		        "pincode": "603103",
		        "street": "williams street"
		      }
		    ]
		  }
		]
*/
		/*List<Object> list1 = new ArrayList<Object>();
		
		Address Address = new Address();
		Address.setCountry("india");
		Address.setStreet("williams street");
		Address.setPincode("603103");
		
		List<Address> list = new ArrayList<Address>();
		list.add(Address);
		
	     Author author = new Author();
	     author.setAuAge(18);
	     author.setBookName("Three Mistakes");
	     author.setFirstName("Vignesh");
	     author.setList(list);
	     
	     list1.add(author);
	     
	     Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
	     String jsonOutput = gson1.toJson(list1);
	     System.out.println(jsonOutput);
	      */
	}

}
