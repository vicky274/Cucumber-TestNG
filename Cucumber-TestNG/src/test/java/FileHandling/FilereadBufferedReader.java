package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilereadBufferedReader {

	public static void main(String[] args) throws InterruptedException {

	       BufferedReader br = null;
	       BufferedReader br2 = null;
	       try{	
	           br = new BufferedReader(new FileReader("./File/file.txt"));		

	           //One way of reading the file
		  // System.out.println("                    HAPPY BIRTHDAY");
		   String contentLine = br.readLine();
		   while (contentLine != null) {
			   Thread.sleep(1000);
		      System.out.println(contentLine);
		      contentLine = br.readLine();
		      Thread.sleep(2000);
		   }
/*
		   br2 = new BufferedReader(new FileReader("./File/file.txt"));

		   //Second way of reading the file
		   System.out.println("Reading the file using read() method:");
		   int num=0;
		   char ch;
		   while((num=br2.read()) != -1)
		   {	
	               ch=(char)num;
		       System.out.print(ch);
		   }
*/
	       } 
	       catch (IOException ioe) 
	       {
		   ioe.printStackTrace();
	       } 
	       finally 
	       {
		   try {
		      if (br != null)
			 br.close();
		      if (br2 != null)
			 br2.close();
		   } 
		   catch (IOException ioe) 
	           {
			System.out.println("Error in closing the BufferedReader");
		   }
		}
	   }
	
}
