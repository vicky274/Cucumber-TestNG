package Serializable;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class serialdemo {

	public static void main(String[] args) throws IOException {
		
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
		
		
        File f = new File("./File/serial.json");
        
        //write to json file
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(f, c);
        System.out.println("written successfully");
        
        //deserialization 
       /* To de-serialize, we call the readValue() method of the ObjectMapper passing in the 
        JSON source and the class type to whose instance the JSON would be deserialized to. 
        The readValue() method is overloaded to accept other JSON input sources such as byte[], 
        String, URL, File, InputStream etc.*/
        
        College c1 = mapper.readValue(f, College.class);
        System.out.println("deserialized successfully "+c1);
        
        
        
        
        
        //to write in file
       /* FileOutputStream fi = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fi);
        out.writeObject(c);
        out.close();
        fi.close();
        System.out.println("written successfully");*/
        
       /* //to write in xml file
		XMLEncoder XMLEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(f)));
		XMLEncoder.writeObject(c);
		XMLEncoder.close();
		System.out.println("written successfully");*/
	}

}