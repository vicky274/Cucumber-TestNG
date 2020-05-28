package Webautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFBox {

	public static void main(String[] args) throws IOException {
		

		try (PDDocument document = PDDocument.load(new File("C:\\Users\\dell\\Downloads\\PDF\\810018_Resume.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {

                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);
               

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
               // System.out.println("Text:" + pdfFileInText);

				// split by whitespace
                //can use System.lineSepartor()
              /*  \n is for unix
                \r is for mac (before OS X)
                \r\n is for windows format
                you can also take System.getProperty("line.separator")*/
                
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println("The text in new line : "+line);
                }

            }

        }


	}

}
