package Restassured;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang.StringEscapeUtils;
import org.json.JSONException;
import org.json.XML;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WritetoJSONFile {
	 private static String link="./src/main/resources/file3.xml";
	 private static String line="",str="";
	public static void main(String[] args) throws IOException, ParseException {
		//WriteintoJson();
		WriteintoJson2();

	}

	
	public static void WriteintoJson() {

		StringBuilder builder = new StringBuilder();
		// Convert xml file data to json format
		try {
			FileWriter wr = new FileWriter("./src/main/resources/WritetoJson.json");
			BufferedReader br = new BufferedReader(new FileReader(link));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				builder.append(line);
			}
			org.json.JSONObject jsondata = XML.toJSONObject(builder.toString());
			Gson gso = new GsonBuilder().setPrettyPrinting().create();
			String jsonstring = gso.toJson(jsondata);
			wr.write(StringEscapeUtils.unescapeJava(jsonstring));
			wr.close();

			System.out.println(StringEscapeUtils.unescapeJava(jsonstring));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	@SuppressWarnings("unchecked")
	public static void WriteintoJson2() throws IOException, ParseException {
		FileWriter wr = null;
		try {

			wr = new FileWriter("./src/main/resources/WritetoJson.json");

			org.json.simple.JSONObject obj3 = new org.json.simple.JSONObject();
			obj3.put("Company1", "Facebook");
			obj3.put("Company2", "PayPal");
			obj3.put("Company3", "Google");
	        
			JSONArray comp = new JSONArray();
			comp.add(obj3);
			
			org.json.simple.JSONObject obj1 = new org.json.simple.JSONObject();
			obj1.put("FirstName", "Vignesh");
			obj1.put("LastName", "Elangovan");
			obj1.put("Address", "Chennai");
			obj1.put("company", comp);
			
			org.json.simple.JSONObject obj2 = new org.json.simple.JSONObject();
			obj2.put("FirstName", "Lokesh");
			obj2.put("LastName", "Gupta");
			obj2.put("Address", "Vellore");
			obj2.put("company", comp);
			
			
			JSONObject employee = new JSONObject(); 
			employee.put("employee1", obj1);
			employee.put("employee2", obj2);
			
			JSONArray employeeList = new JSONArray();
	        employeeList.add(employee);
	        
	        JSONArray j = (JSONArray) new JSONParser().parse(employeeList.toJSONString());
	        
	        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // pretty print
	        String prettyJson = gson.toJson(j);
	        
			System.out.println(prettyJson);
			
			wr.write(prettyJson);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			wr.flush();
			wr.close();
			System.out.println("-------------------------Written to Json Successfully-----------------------");
		}
	}
	
}
