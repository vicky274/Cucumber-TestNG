package Restassured;

import org.json.XML;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.lang.StringEscapeUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class XMLToJson {

	 public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	 static String line="",str="";
	public static void main(String[] args) throws IOException {
		
		 try {
	         JSONObject json = XML.toJSONObject("./src/main/resources/file3.xml"); // converts xml to json
	         String jsonPrettyPrintString = json.toString(); // json pretty print
	         System.out.println(jsonPrettyPrintString);
	      } catch(JSONException je) {
	         System.out.println(je.toString());
	      }

		 
		 
		 try {
	            JSONObject xmlJSONObj = XML.toJSONObject("./src/main/resources/file3.xml");
	            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
	            System.out.println(jsonPrettyPrintString);
	        } catch (JSONException je) {
	            System.out.println(je.toString());
	        }
		
		
		 StringBuilder builder =  new StringBuilder(); 
		 //Convert xml file data to json format
		 String link = "./src/main/resources/file3.xml";
		 
	        BufferedReader br = new BufferedReader(new FileReader(link));
	        while ((line = br.readLine()) != null) 
	        {   
	        	System.out.println(line);
	        	builder.append(line);
	        	
	            //str+=StringEscapeUtils.unescapeJava(line);  
	        }
	        JSONObject jsondata = XML.toJSONObject(builder.toString());
	       
	        //System.out.println(jsondata.toString(PRETTY_PRINT_INDENT_FACTOR));
	    
	    	Gson gso = new GsonBuilder().setPrettyPrinting().create();
	    	String jsonstring = gso.toJson(jsondata);
	    	
	    	System.out.println(StringEscapeUtils.unescapeJava(jsonstring));
		   
	}

}
