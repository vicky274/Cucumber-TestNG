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
		//readjson();
		//readjsonstring();
		//readjsonfromfile();
		readjsonfromfileusingGson();
    }
	
	
	public static void readjson(){
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
	
	public static void readjsonstring(){
		String payload = "{\n" +
		        "  \"description\": \"Some Description\",\n" +
		        "  \"id\": \"Some id\",\n" +
		        "  \"name\": \"Some name\"\n" +
		        "}";
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject obj = new JsonParser().parse(payload).getAsJsonObject();
		System.out.println(gson.toJson(obj));
		
		JsonElement ele = obj.get("description");
		System.out.println(ele.toString());
	}

	//read using Gson........................................................................................
		public static void readjsonfromfileusingGson() {
			System.out.println("----------------------------Read using GSON Library----------------------------------");
			// JSON parser object to parse read file
			JsonParser jsonParser = new JsonParser();

			try (FileReader reader = new FileReader("./src/main/resources/ValidateJsonInFile2.json")) {
				Gson gso = new GsonBuilder().setPrettyPrinting().create();
				// Read JSON file
				JsonObject jsonobject = jsonParser.parse(reader).getAsJsonObject();
				System.out.println("Data in File:\n " + gso.toJson(jsonobject));
				
				JsonArray jsonarray = (JsonArray) jsonobject.get("weather");
				
				for (int i = 0; i < jsonarray.size(); i++) {
					JsonElement jsonobjec = jsonarray.get(i);
					System.out.println("JsonElement:\n " + gso.toJson(jsonobjec));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	//read using org.json........................................................................................
	public static void readjsonfromfile() {
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
