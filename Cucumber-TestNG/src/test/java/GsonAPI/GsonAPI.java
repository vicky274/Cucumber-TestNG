package GsonAPI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonAPI {

	

	public static void main(String[] args){
		
		//JavaobjectToJson();
	//	javaStringtoJson();
	readjsonstring();
	
	}
	
	
	
	private  static Employee CreateEmployeeObject(){
		
		Employee employee = new Employee();
		
		employee.setName("Vicky");
		employee.setAge(25);
		employee.setSkills(Arrays.asList("Java","python","Kotlin"));
		employee.setPosition(Arrays.asList("Tester","Senior Tester"));
		
		Map<String, Long> map = new HashMap<String, Long>(){
			
			private static final long serialVersionUID = 1L;

			{
				put("2018", 3000L);
				put("2019", 4000L);
				put("2020", 5000L);
			}
			
		};
		
		employee.setMap(map);
		
		return employee;
		
	}
	
	
	public static void javaStringtoJson(){
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String[] lang = {"Java", "Node", "Kotlin", "JavaScript"};
        try(FileWriter write = new FileWriter(new File(".//File//Gsonapi.json"))){
			
        	gson.toJson(lang, write);
			System.out.println("Written Successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}
	
	
	public static void JavaobjectToJson(){
        
		Employee employee =CreateEmployeeObject();
		
		Gson gson =new GsonBuilder().setPrettyPrinting().create();
		
		String json =gson.toJson(employee);
		System.out.println(json);
		
		try(FileWriter write = new FileWriter(new File(".//File//Gsonapi.json"))){
			
			gson.toJson(employee, write);
			System.out.println("Written Successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void readjsonstring()
	{
		
		String payload = "{\n" +
		        "  \"description\": \"Some Description\",\n" +
		        "  \"id\": \"Some id\",\n" +
		        "  \"name\": \"Some name\"\n" +
		        "}";
		//The GSON JsonParser class can parse a JSON string or stream into a tree structure of Java objects.
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject obj = new JsonParser().parse(payload).getAsJsonObject();
		System.out.println(obj);
		System.out.println(new Gson().toJson(obj));
		System.out.println(gson.toJson(obj));
		
	}

	
}
