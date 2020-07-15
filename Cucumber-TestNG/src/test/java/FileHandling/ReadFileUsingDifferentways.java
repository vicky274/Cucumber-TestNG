package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileUsingDifferentways {

	public static void main(String[] args) {
		
		System.out.println("----------------File InputStream-------------------------");
		//1) File input stream -reads in byte format , used to read image, audio, video files
		FileInputStream input = null;
		int c;
		File file = new File("./File/file.txt");
		
		try {
			input = new FileInputStream(file);
			
			while ((c = input.read()) != -1) {
				char data = (char) c;
				System.out.print(data);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------File Reader-------------------------");
		//2) using file reader and buffered reader -buffering of data for fast reading
		FileReader reader=null;
		BufferedReader buffer=null;
		try {
			reader = new FileReader(file);
			buffer= new BufferedReader(reader);
			String s;
			while((s=buffer.readLine())!=null){
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("----------------Scanner-------------------------");
		//3)Scanner-provides parsing ability
		Scanner scan;
		try {
			scan = new Scanner(file);
			
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		/*String str= "This#string%contains^special*characters&.";   
		str = str.replaceAll("\\W+", " ");  
		System.out.println(str);  */
		
		//------------
		System.out.println("----------------Scanner-------------------------");
		Scanner scan1;
		try {
			scan1 = new Scanner(file);
			while(scan1.hasNext("\\W+")){
				System.out.println(scan1.next());
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
