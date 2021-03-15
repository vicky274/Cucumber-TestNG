package Webautomation;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFBox {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	public static void main(String[] args) throws IOException {
		
		//readPdfContent("file:///C:/Users/DELL/Downloads/paytm-com-about-us-our-policies--tandc.pdf");
		
		
		//FileWriter write =new FileWriter(new File("C:\\Users\\DELL\\Downloads\\File.txt"));
		//PrintWriter out = new PrintWriter(new File("C:\\Users\\DELL\\Downloads\\Fileft.txt"));
		
		
		try (PDDocument document = PDDocument.load(new File("C:\\Users\\DELL\\Downloads\\paytm-com-about-us-our-policies--tandc.pdf"))) {

			document.getClass();

			if (!document.isEncrypted()) {
				// PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				// stripper.setSortByPosition(true);
				PDFTextStripper tStripper = new PDFTextStripper();
				tStripper.setStartPage(2);
				tStripper.setEndPage(2);
				String pdfFileInText = tStripper.getText(document);

				String lines[] = pdfFileInText.split("\\r?\\n");
				for (String line : lines) {
					System.out.println(line);
					//write.write(line);
					//out.println(line);
					Files.write(Paths.get("C:\\Users\\DELL\\Downloads\\File.txt"), line.getBytes(StandardCharsets.UTF_8));
				}

			} else {
				System.out.println("Document is Encrypted");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			//write.close();
			//out.close();
		}

	}

public static  String readPdfContent(String url) throws IOException {
		
		String content = null;
		try {
			URL pdfUrl = new URL(url);
			InputStream in = pdfUrl.openStream();
			BufferedInputStream bf = new BufferedInputStream(in);
			PDDocument doc = PDDocument.load(bf);
			int numberOfPages = getPageCount(doc);
			System.out.println("The total number of pages "+numberOfPages);
			content = new PDFTextStripper().getText(doc);
			doc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	return content;
}

public static int getPageCount(PDDocument doc) {
	//get the total number of pages in the pdf document
	int pageCount = doc.getNumberOfPages();
	return pageCount;
	
}
}
