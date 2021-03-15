package Restassured;

import java.util.Base64;

import io.restassured.RestAssured;
import io.restassured.config.RedirectConfig;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.XmlPath.CompatibilityMode;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GmailAPI {
//https://rahulshettyacademy.com/getCourse.php
	//https://oauth.pstmn.io/v1/callback
	static final String CLIENT_ID="747145724612-k8o0vj0i1khfh41tp3o6ve716fk4og9p.apps.googleusercontent.com";
	static final String CLIENT_SECRET="8mOhlp1rF0p-iYpRSSYwf3HH";
	static final String GRANT_TYPE="authorization_code";
	static final String BASE_URI="https://accounts.google.com";
	static final String REDIRECT_URI="https://oauth.pstmn.io/v1/callback";
	static final String SCOPE="https://www.googleapis.com/auth/gmail.readonly";
    public static final String username = "vimessi2@gmail.com";
    public static final String password = "Deepa@2205";
    private static String authorization=null;
    public static String encode(String str1, String str2) {
        return new String(Base64.getEncoder().encode((str1 + ":" + str2).getBytes()));
    }

    public static Response getCode() {
    	
        authorization = encode(username, password);
        System.out.println(authorization);
        
        
               Response resp1= RestAssured.given().urlEncodingEnabled(false)
            		    .config(RestAssured.config().redirect(RedirectConfig.redirectConfig().followRedirects(true)))
                        .header("Accept", "*/*")
                        .header("Authorization", "Basic " + authorization)
                        .queryParam("response_type", "code")
                        .queryParam("client_id", CLIENT_ID)
                        .queryParam("scope", SCOPE)
                        .queryParam("redirect_uri", REDIRECT_URI)
                        .when()
                        .post("/o/oauth2/auth").then()
                        .extract()
                        .response();
        
       
        
		return resp1;
        
    }

    public static String parseForOAuth2Code(Response response) {
    	
        return response.jsonPath().getString("code");
    }

  
    /*
    
    public static void setup() {
        RestAssured.baseURI = "https://some-url.com";
    }
*/
   
    public static String iShouldGetCode() {
        Response response = getCode();
       // XmlPath xmlPath = new XmlPath(CompatibilityMode.HTML, response.asString());
       // System.out.println(xmlPath.getString("html.head.title"));
        System.out.println("--------------------------------------Response----------------------------------");
        response.prettyPrint();
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
        String code = parseForOAuth2Code(response);
        Assert.assertNotNull(code);
		return code;
    }

   
    public static Response getToken(String authCode) {
    	
        return
            RestAssured.given().urlEncodingEnabled(false)
                .queryParam("code", authCode)
                .queryParam("client_id", CLIENT_ID)
                .queryParam("client_secret", CLIENT_SECRET)
                .queryParam("redirect_uri", REDIRECT_URI)
                .queryParam("grant_type", GRANT_TYPE)
                .post("/o/oauth2/token")
                .then().contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        }

        public static String parseForAccessToken(Response loginResponse) {
        	
        	loginResponse.prettyPrint();
            return loginResponse.jsonPath().getString("access_token");
        }

        
        public static String iShouldGetToken() {
        	
        	//String code =iShouldGetCode();
        	String code="4%2F0AY0e-g4ShuQjuvCi4Nj3brzSaGf0m3scpjF-MH6UVJ--8C_km2wEyn9Nvd9U0AF0qpOphQ";
            Response tokenResponse = getToken(code);
            String accessToken = parseForAccessToken(tokenResponse);
            System.out.println("ACCESS_TOKEN :"+accessToken);
            Assert.assertNotNull(accessToken);
			return accessToken;
        }
        
        
        public static void main(String[] args) {
        	
        	 authorization = encode(username, password);
             System.out.println(authorization);
             
        	
        	 RestAssured.baseURI = BASE_URI;
        	//String token = iShouldGetToken();
        	
           String token ="ya29.a0AfH6SMDRpK0fldS90cKTmaP_ztWmz3OacuUj9XZvUukEMkcqPqVtFohfP4aTH_MbwOykEnXAGvD5tZZPhlkalnqYWZOha5SxYx94z40OzeYzj0Ln92xGxTbezqZUUDWCWAK1tpdH0xzfOAmWim-xsWlavIOlEA";
            Response res =  RestAssured.given().urlEncodingEnabled(false)
            	.header("Authorization", "Basic " + authorization)
            	.header("User-Agent", "PostmanRuntime/7.26.10")
            	.header("Accept-Encoding", "gzip, deflate, br")
            	.header("Host","accounts.google.com")
            	.auth()
                .oauth2(token)
                .when().pathParam("userId", username)
                .get("/gmail/v1/users/{userId}/messages")
                .then().contentType("application/json; charset=UTF-8").extract().response();
            
            res.prettyPrint();
            
            Assert.assertEquals(res.getStatusCode(), 200);
        }
    	
    	
        	
}
