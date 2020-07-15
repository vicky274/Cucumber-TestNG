package Restassured;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class ValidateJsonInFile {

	static JSONParser jsonParser = new JSONParser();
	
	public static void main(String[] args) {
		
		/*[
		  {
		    "state": "open",
		    "throughput": 800.0,
		    "id": "1",
		    "name": "Stealth Strike",
		    "description": "Are you brave enough to ride the legendary 'Stealth Strike' ?",
		    "info": {
		      "visible.restrictions.min_height": "140cm"
		    }
		  },
		  {
		    "state": "open",
		    "throughput": 400.0,
		    "id": "2",
		    "name": "The Rapids",
		    "description": "Enjoy a leisurely ride on our famous boat ride",
		    "info": {
		      "visible.restrictions.min_height": "110cm",
		      "visible.restrictions.min_accompanied_height": "90cm"
		    }
		  }
		]*/
		
        //need to add square bracket for this scenario in file
        try (FileReader reader = new FileReader("./src/main/resources/ValidateJsonInFile.json"))
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
                System.out.println("JsonArray :\n"+jsonOutput);
                System.out.println("JsonObject inside Array :\n" +gso.toJson(employeeList.get(0)));
               
                
            }
        
        }  
        catch (Exception e) {
            e.printStackTrace();
        }
        
        //*********************************************************************************************************************
        
		/*{
		    id: 1,
		    name: "Leanne Graham",
		    username: "Bret",
		    email: "Sincere@april.biz",
		    address: {
		        street: "Kulas Light",
		        suite: "Apt. 556",
		        city: "Gwenborough",
		        zipcode: "92998-3874",
		        geo: {
		            lat: "-37.3159",
		            lng: "81.1496"
		        }
		    },
		    phone: "1-770-736-8031 x56442",
		    website: "hildegard.org",
		    company: {
		        name: "Romaguera-Crona",
		        catchPhrase: "Multi-layered client-server neural-net",
		        bs: "harness real-time e-markets"
		    }
		}
		*/
		
        
 /*       try (FileReader reader = new FileReader("./src/main/resources/ValidateJsonInFile.json"))
        {
        	Gson gso = new GsonBuilder().setPrettyPrinting().create();
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            if(obj instanceof JSONObject){
            	
            JSONObject JSONObject = (JSONObject)obj;
            String jsonOutput = gso.toJson(JSONObject);
            System.out.println(jsonOutput);
           
            }
         
        }  
        catch (Exception e) {
            e.printStackTrace();
        }*/
        
	}

}
