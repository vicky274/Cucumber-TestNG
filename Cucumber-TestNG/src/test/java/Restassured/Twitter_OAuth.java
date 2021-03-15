package Restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Twitter_OAuth {

	public static void main(String[] args) {
		
		//https://api.twitter.com/1.1/statuses/update.json
		
		String token ="AAAAAAAAAAAAAAAAAAAAAKXvNQEAAAAAl6Q%2BQTlm25fn5oWXZhcaPlZI%2Fu8%3DyzoTvXPhIrYdlwOF0DY0d0uepEb3aUOrdlr0lGE58ySGGJsb2v";
		
		/*Response response =RestAssured.given().auth()
		.oauth("dbkQ6ofxaKRU1O1T5kitzrLeF", "BRvP4j4nXFfG8l4DpDTZWOZycliktyzGHhPHR43VMxDYzKfOSm", 
				"1369191918941270016-mMJj8xf7OQwwmZ13VVLMMx0ObTimrb", 
				"Ws9oQwbPtD0LyEsO0czwPmwEclkcTKeB6ts2cC15xLfs7")
		.post("https://api.twitter.com/1.1/statuses/update.json?status=This is my first tweet");
		
		System.out.println(response.getStatusCode());
*/
		
		Response respons =RestAssured.given().header("Authorization", "Bearer "+token)
				.post("https://api.twitter.com/1.1/statuses/update.json?status=This is my first tweet");
				
		System.out.println(respons.getStatusCode());
	}

}
