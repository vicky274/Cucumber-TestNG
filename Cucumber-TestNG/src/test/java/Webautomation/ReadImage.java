package Webautomation;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {

	public static void main(String[] args) {
		
		ITesseract tesseract = new Tesseract(); 
        try { 
        	File file = new File("C:\\Selenium_Workspace\\Cucumber-TestNG\\tessdata\\proxy.png");
        			if (file.exists()) {
        			  System.out.println("File Exists");
        			}
        	
            tesseract.setDatapath("C:\\Selenium_Workspace\\Cucumber-TestNG\\tessdata"); 
  
            String text  = tesseract.doOCR(new File("C:\\Selenium_Workspace\\Cucumber-TestNG\\tessdata\\proxy.png")); 
  
            // path of your image file 
            System.out.print(text); 
        } 
        catch (TesseractException e) { 
            e.printStackTrace(); 
        } 
        

	}

}
