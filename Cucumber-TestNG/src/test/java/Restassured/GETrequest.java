package Restassured;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GETrequest {

	/*authentication is the process of verifying who a user is, 
	while authorization is the process of verifying what they have access to.*/
	
	public static void main(String[] args) {

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		/*
		 * RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5";
		 * 
		 * RequestSpecification httpRequest = RestAssured.given(); Response
		 * response = httpRequest.queryParam("q", "London,UK")
		 * .queryParam("appid", "b6907d289e10d714a6e88b30761fae22")
		 * .get("/weather");
		 * 
		 * String responseBody = response.getBody().prettyPrint();
		 * System.out.println("Response Body is =>  " + responseBody);
		 */

		 RestAssured.baseURI = "https://reqres.in";
		 RequestSpecification httpRequest = RestAssured.given();
		 
		
	
		 Response response = httpRequest.get("/api/users?page=2");
		 
		 response.getBody().prettyPrint();
		 
		 Object obj = response.jsonPath().getJsonObject("ad");
		 System.out.println(obj);
		 
		 Gson g= new GsonBuilder().setPrettyPrinting().create();
		 System.out.println(g.toJson(obj));
		 
		 List<String> list = response.jsonPath().getList("data.email");
		 
		 for(String li : list){
			 System.out.println(li);
		 }
		
		 List<HashMap<String,Object>>booksList=response.jsonPath().getList("data");
		 
		//Now parse value from List
		HashMap<String,Object> firstBookDetails=booksList.get(0);
		
		//Map<String,String> map =  response.jsonPath().getMap("data.email");
		
		for(Map.Entry<String,Object> entry : firstBookDetails.entrySet()){
			System.out.println("KEY : "+entry.getKey() +"   VALUE : "+entry.getValue());
		};
		 

		//----------------------------------------
	     ValidatableResponse response1 = httpRequest.get("/api/users?page=2")
	    		 .then().assertThat().body("data.id[0]", equalTo(7)).log().all();
	}

}
