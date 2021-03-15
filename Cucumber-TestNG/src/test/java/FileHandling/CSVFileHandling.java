package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class CSVFileHandling {

	public static void main(String[] args) {
		Scanner sc = null;
		List<String> values=new ArrayList<String>();
		//Multimap<String, String> map = ArrayListMultimap.create();
		Map<String,String> map =new LinkedHashMap<String,String>();
		try {
			sc = new Scanner(new File("./File/Test.csv"));
			sc.useDelimiter(","); 
		
			while(sc.hasNextLine()){
				String line =sc.nextLine();
				values.add(line);
				System.out.println(line);
			}
			
			for(int i=1; i<values.size();i++){
			
				String s1 = values.get(i);
				//System.out.println(s1);
				
				if(s1.contains("Sanity")){
					String s2 = s1.replaceAll("false", "true");
					System.out.println("Updated :"+s2);
				}
				
				
				
				String[] s = s1.split(", ");
				String status =s[0];String Scenario=s[1];String Testcase=s[2];
				map.put(Scenario, status);
				
			}
			
			/*for (Map.Entry<String,String> entry : map.entrySet()) 
			{
				
	            System.out.println("Scenario = " + entry.getKey() + ", Status = " + entry.getValue()); 
	            
	            String Scenario =entry.getKey();
	            
	            if(entry.getKey().equalsIgnoreCase("Sanity")){
	            	map.replace(Scenario, "true");
	            }
	            else{
	            	map.replace(Scenario, "false");
	            }
	            
	            
	            
	    } */
			/*values.clear();
            System.out.println(values.size());
            
			for (Map.Entry<String,String> entry : map.entrySet()) 
			{
				System.out.println("Updated Value");
	            values.add(entry.getValue()+", "+entry.getKey()+", Testcase1");
	          
	    } 
			
			
			for(int i=0; i<values.size();i++){
				
				String s1 = values.get(i);
				System.out.println(s1);
			}*/
			
			/*sc = new Scanner(new File("./File/Test.csv"));
			sc.useDelimiter(","); 
			
			while (sc.hasNext()) 
			{
			
			String value=sc.next().trim();
			System.out.println(value); 
			
			}   */
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}  
		finally{
			if(sc!=null){
				sc.close();
			}
		}
		 //closes the scanner 

	}

}
