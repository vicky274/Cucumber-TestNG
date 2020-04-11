package Restassured;

import org.json.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Deserialization {

	/*Serialization is a process where you convert an Instance of a Class (Object of a class) into a Byte Stream. 
	This Byte Stream can then be stored as a file on the disk or can also be sent to another computer via the network. 
	Serialization can also be used to save the sate of Object when the program shuts down or hibernates. 
	Once the state is saved on disk using Serialization, we can restore the state by DeSerializing the class from disk.*/
	
	public static void main(String[] args) {
		 RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "Virender"); // Cast
		 requestParams.put("LastName", "Singh");
		 requestParams.put("UserName", "63userf2d3d2011");
		 requestParams.put("Password", "password1"); 
		 requestParams.put("Email",  "ed26dff39@gmail.com");
		 
		 request.body(requestParams.toString());
		 Response response = request.post("/register");
		 
		 ResponseBody body = response.getBody();
		 System.out.println(body.prettyPrint());
		 // Deserialize the Response body into RegistrationSuccessResponse
		// RegistrationSuccessResponse responseBody = body.as(RegistrationSuccessResponse.class);
		 
		 // Use the RegistrationSuccessResponse class instance to Assert the values of 
		 // Response.
		// Assert.assertEquals("OPERATION_SUCCESS", responseBody.SuccessCode);
		// Assert.assertEquals("Operation completed successfully", responseBody.Message);

	}

}
