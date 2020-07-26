package Serializable;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class serialdemo {
	static Gson g = new Gson();
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student s1 = new Student();
		s1.setName("vicky");
		s1.setRollno(1);
		
		Student s2 = new Student();
		s2.setName("vignesh");
		s2.setRollno(2);
		
		Student s3 = new Student();
		s3.setName("deep");
		s3.setRollno(3);
		
		List<Student> list  = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		College c = new College();
		c.setStudents(list);
		
		System.out.println("-----------------------------Writetojson------------------------------");
        File f = new File("./File/serial.json");
        //write to json file
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(f, c);
        System.out.println("Write data to Json - written successfully");
        
        
        //deserialization 
       /* To de-serialize, we call the readValue() method of the ObjectMapper passing in the 
        JSON source and the class type to whose instance the JSON would be deserialized to. 
        The readValue() method is overloaded to accept other JSON input sources such as byte[], 
        String, URL, File, InputStream etc.*/
        
    
        
        
        System.out.println("-----------------------------Deserialize the Object------------------------------");
        College c1 = mapper.readValue(f, College.class);
        System.out.println("deserialized successfully "+c1);
        String jsonstring = g.toJson(c1);
        System.out.println(jsonstring);
        JsonObject jo = new JsonParser().parse(jsonstring).getAsJsonObject();
    	Gson gso = new GsonBuilder().setPrettyPrinting().create();
    	System.out.println(gso.toJson(jo));
    	
    	
        System.out.println("-----------------------------Deserialize using Gson------------------------------");
        FileReader f12 = new FileReader("./File/serial.json");
        College c2 =g.fromJson(f12, College.class);
        String jsonstring2 = g.toJson(c2);
        System.out.println(jsonstring2);
        JsonObject jo2 = new JsonParser().parse(jsonstring2).getAsJsonObject();
    	Gson gso2 = new GsonBuilder().setPrettyPrinting().create();
    	System.out.println(gso2.toJson(jo2));
    	
    	
    	
    	System.out.println("--------------------------Serialization in Text File---------------------------------");
        File f1 = new File("./File/serialization.txt");
        //to write in file
        FileOutputStream fo = new FileOutputStream(f1);
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(c);
        out.close();
        fo.close();
        System.out.println("Serialization of Text File -  written successfully");
        
        
        
        
        System.out.println("-----------------------------Deserialize Text File ------------------------------");
        FileInputStream fi = new FileInputStream(f1);
        ObjectInputStream ou = new ObjectInputStream(fi);
        Object o = ou.readObject();
        System.out.println(o);
        ou.close();
        fi.close();
        
        
        
        
        System.out.println("--------------------------Write in XML File---------------------------------");
        File xml = new File("./File/serial.xml");
        //to write in xml file
		XMLEncoder XMLEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(xml)));
		XMLEncoder.writeObject(c);
		XMLEncoder.close();
		System.out.println("Write data to Xml -written successfully");
	}

}
