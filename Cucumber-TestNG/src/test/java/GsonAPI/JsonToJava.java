package GsonAPI;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import com.google.gson.GsonBuilder;

public class JsonToJava {

	//read and write as stream 
	//https://mkyong.com/java/gson-streaming-to-read-and-write-json/
	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		

		try(FileReader read = new FileReader(new File(".//File//Gsonapi.json"))){
			
			//convert json to java object
			Employee employee =gson.fromJson(read, Employee.class);
			
			System.out.println(employee);
			
			//to convert java object to represent in json format
			System.out.println(gson.toJson(employee));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
