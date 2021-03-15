package GsonAPI;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadJsonFileUsingGson {

	public static void main(String[] args) {
		
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
				JsonObject jsonobjec = jsonarray.get(i).getAsJsonObject();
				System.out.println(jsonobjec.get("id"));
				System.out.println("JsonElement:\n " + gso.toJson(jsonobjec));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
