package Restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_Test {

	static final String CLIENT_ID="RestAssured22";
	static final String CLIENT_SECRET="4eb75821ff500d3dbe48e250cd7a3b77";
	static final String GRANT_TYPE="client_credentials";
	static final String BASE_URI="http://coop.apps.symfonycasts.com";
	
	
	public static String Authentication(){
		 RestAssured.baseURI=BASE_URI;
		 Response res = RestAssured.given().formParam("client_id", CLIENT_ID)
		.formParam("client_secret", CLIENT_SECRET)
		.formParam("grant_type", GRANT_TYPE)
		.formParam("scope", "eggs-count")
		.post("/token").thenReturn();
		
		res.prettyPrint();
		String token =res.jsonPath().get("access_token").toString();
		System.out.println("TOKEN :"+token);
		return token;
	}
	
	
	public static void main(String[] args) {
		
		String token =Authentication();
		Response response =RestAssured.given().auth().oauth2(token).post("/api/1751/eggs-count").thenReturn();
		response.prettyPrint();
		
	}

}
