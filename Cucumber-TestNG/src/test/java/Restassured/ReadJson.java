package Restassured;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class ReadJson {

	public static void main(String[] args) {
		
		//JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("./src/main/resources/file1.json"))
        {
        	Gson gso = new GsonBuilder().setPrettyPrinting().create();
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            if(obj instanceof JSONObject){
            JSONObject JSONObject = (JSONObject)obj;
            String jsonOutput = gso.toJson(JSONObject);
            System.out.println(jsonOutput);
            }
            else{
            	JSONArray employeeList = (JSONArray) obj;
            	String jsonOutput = gso.toJson(employeeList);
                System.out.println(jsonOutput);
            }
        
        }  
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
