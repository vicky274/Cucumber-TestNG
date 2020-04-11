package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.common.io.Files;

public class ReadFiletolist {

	public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	  
	      lines = Files.readLines(new File("./File/file.txt"), StandardCharsets.UTF_8);
	    } 
	  
	    catch (IOException e) 
	    { 
	  
	      // do something 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	  public static void main(String[] args) 
	  { 
	    List<String> l = readFileInList("./File/file.txt"); 
	  
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 
	  }
}
