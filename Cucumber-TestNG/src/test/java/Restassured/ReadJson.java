package Restassured;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadJson {

	public static void main(String[] args) {
		
		//readjsonfromfile();
		//readjsonfromfileusingGson();
    }
	
	
	public static void readjson_usingSimpleJson(){
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
            System.out.println("Json Object : "+jsonOutput);
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
	
	
	//read using org.json........................................................................................
	public static void readjsonfromfile_UsingOrgJson() {
		System.out.println("----------------------------Read using org.json Library----------------------------------");
		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader("./src/main/resources/ValidateJsonInFile2.json")) {
			Gson gso = new GsonBuilder().setPrettyPrinting().create();
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONObject jsonobject = new JSONObject(obj.toString());
			JSONArray jsonarray = (JSONArray) jsonobject.get("weather");

			for (int i = 0; i < jsonarray.length(); i++) {
				JSONObject jsonobjec = jsonarray.getJSONObject(i);

				System.out.println("JsonObject:\n " + gso.toJson(jsonobjec));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
