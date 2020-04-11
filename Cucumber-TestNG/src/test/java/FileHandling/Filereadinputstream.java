package FileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filereadinputstream {

	public static void main(String[] args) {         
	      //Specify the path of the file here
	      File file = new File("./File/file.txt");
	      BufferedInputStream bis = null;
	      FileInputStream  fis= null;

	      try
	      {
	          //FileInputStream to read the file
	          fis = new FileInputStream(file);
	          bis = new BufferedInputStream(fis);

	          while( bis.available() > 0 ){             	
	              System.out.print((char)bis.read());
	          }

	       }catch(FileNotFoundException fnfe)
	        {
	            System.out.println("The specified file not found" + fnfe);
	        }
	        catch(IOException ioe)
	        {
	            System.out.println("I/O Exception: " + ioe); 
	        }
	        finally
	        {
	            try{
	               if(bis != null && fis!=null)
	               {
	       	          fis.close();
	                  bis.close();
	               }      
	             }catch(IOException ioe)
	              {
	                  System.out.println("Error in InputStream close(): " + ioe);
	              }         
	        }
	   }    
	
}
