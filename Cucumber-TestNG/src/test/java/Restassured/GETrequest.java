package Restassured;

import java.util.List;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETrequest {

	public static void main(String[] args) {

		// Get the RequestSpecification of the request that you want to sent
				 // to the server. The server is specified by the BaseURI that we have
				 // specified in the above step.
		
		
		/* RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5";
		
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.queryParam("q", "London,UK") 
                 .queryParam("appid", "b6907d289e10d714a6e88b30761fae22") 
                 .get("/weather");
	
		
		 String responseBody = response.getBody().prettyPrint();
		 System.out.println("Response Body is =>  " + responseBody);
		 */
		
		 
		 RestAssured.baseURI = "https://reqres.in";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("/api/users?page=2");
		 
		 String responseBody = response.getBody().prettyPrint();
		 
		 Object obj = response.jsonPath().getJsonObject("ad");
		 System.out.println(obj);
		 Gson g= new GsonBuilder().setPrettyPrinting().create();
		 System.out.println(g.toJson(obj));
		 
		 List<String> list = response.jsonPath().getList("data.email");
		 
		 for(String li : list){
			 System.out.println(li);
		 }
		 
		
		 

	}

}
