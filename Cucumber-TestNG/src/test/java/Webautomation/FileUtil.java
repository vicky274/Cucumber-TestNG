package Webautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtil {

	public static void main(String[] args) throws IOException {
		
		String path ="C:\\Users\\dell\\Downloads";
		
		File zi=new File("C:\\Users\\dell\\Downloads\\Zip");
		File f=new File(path);
		
		if(f.exists()) 
		{
			System.out.println("File Exists");
			
			if(f.isDirectory()) 
			{
				System.out.println("File is a Directory");
				File[] file = f.listFiles();
				System.out.println("File count :"+file.length);
				for(File fi :file) 
				{
					if(fi.isFile())
					{
						
						/*if(fi.getPath().endsWith(".zip"))
						{
							if(zi.exists())
							{
							FileUtils.moveFileToDirectory(fi, zi, false);
							}
							else
							{
								FileUtils.moveFileToDirectory(fi, zi, true);
							
							}
							System.out.println("zip written");
					 }*/
						
						if(fi.getPath().endsWith(".jpeg")||fi.getPath().endsWith(".png")||fi.getPath().endsWith(".jpg")){
							FileUtils.moveFileToDirectory(fi, new File("C:\\Users\\dell\\Downloads\\Images"), false);
						}
						else if(fi.getPath().endsWith(".xlsx")){
							FileUtils.moveFileToDirectory(fi, new File("C:\\Users\\dell\\Downloads\\Excel"), false);
						}
						
						else if(fi.getPath().endsWith(".pdf")){
						FileUtils.moveFileToDirectory(fi, new File("C:\\Users\\dell\\Downloads\\PDF"), false);
						}
						
						else if(fi.getPath().endsWith(".exe")){
							FileUtils.moveFileToDirectory(fi, new File("C:\\Users\\dell\\Downloads\\ExeFile"), false);
						}
						
						else if(fi.getPath().endsWith(".jar")){
							FileUtils.moveFileToDirectory(fi, new File("C:\\Users\\dell\\Downloads\\JAR"), false);
						}
						
						else if(fi.getPath().endsWith(".docx")||fi.getPath().endsWith(".doc")){
							FileUtils.moveFileToDirectory(fi, new File("C:\\Users\\dell\\Downloads\\Worddoc"), false);
						}
						
						else{
							FileUtils.moveFileToDirectory(fi,  new File("C:\\Users\\dell\\Downloads\\Extra"), false);
						}
						}
						
					 /*if(fi.isDirectory()) {
						
						FileUtils.moveDirectoryToDirectory(fi, new File("C:\\Users\\dell\\Downloads\\DirectoryFolder"), false);
						
					 }*/
					 
		
					 }//for loop
					
				}
				
				System.out.println("written successfully");
			}
		
	}

}
