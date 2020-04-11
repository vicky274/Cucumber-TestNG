package demo;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NewTest {
	ExtentTest test;
	Markup m;
  @Test
  public void ExtentReport() {
	  
	  
	  ExtentHtmlReporter html = new ExtentHtmlReporter("./ExtentReport/Extent.html");
	  html.config().setDocumentTitle("Automation Report");
	  html.config().setReportName("Smoke Report");
	  html.config().setTheme(Theme.DARK);
	  html.config().setAutoCreateRelativePathMedia(true);
	  ExtentReports extent = new ExtentReports();
	  extent.attachReporter(html);
	  extent.setSystemInfo("Operating System", "Windows");
	  extent.setSystemInfo("Author", "Vignesh");
	 
	   test = extent.createTest("Login test case one");
	  String code = "<root>" + 
				"\n    <Person>" + 
				"\n        <Name>Joe Doe</Name>" + 
				"\n        <StartDate>2007-01-01</StartDate>" + 
				"\n        <EndDate>2009-01-01</EndDate>" + 
				"\n        <Location>London</Location>" + 
			"\n    </Person>                    " + 
			"\n    <Person>" + 
				"\n        <Name>John Smith</Name>" + 
				"\n        <StartDate>2012-06-15</StartDate>" + 
				"\n        <EndDate>2014-12-31</EndDate>" + 
				"\n        <Location>Cardiff</Location>" + 
			"\n    </Person>" +
		"\n</root>";
		 m = MarkupHelper.createCodeBlock(code, CodeLanguage.XML);
		test.pass(m);
		
		
		
		test = extent.createTest("Login test case two");
		// json
		String json = "{'foo' : 'bar', 'foos' : ['b','a','r'], 'bar' : {'foo':'bar', 'bar':false,'foobar':1234}}";
		test.pass(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));

		
		
		test = extent.createTest("Login test case three");
		// java chars
		code = "\n\t\n\t\tText\n\t\n";
		m = MarkupHelper.createCodeBlock(code);
		test.pass(m);
		
		
		test = extent.createTest("Login test case four");
		String text = "extent";
		 m = MarkupHelper.createLabel(text, ExtentColor.BLUE);

		test.pass(m);
		
		
		test = extent.createTest("Login test case five");
		Object[][] data = {
			    { "Header1", "Header2", "Header3" },
			    { "Content.1.1", "Content.2.1", "Content.3.1" },
			    { "Content.1.2", "Content.2.2", "Content.3.2" },
			    { "Content.1.3", "Content.2.3", "Content.3.3" },
			    { "Content.1.4", "Content.2.4", "Content.3.4" }
			};
		System.out.println(data.length);
		System.out.println(data[0].length);
		String[][] a = new String[data.length][data[0].length];
		
		 for (int i = 0; i < data.length; ++i) {
		        for(int j = 0; j < data[i].length; ++j) {
		          a[i][j]=data[i][j].toString();
		          System.out.println(a[i][j]);
		        }
		     }
		 
		 
			 m = MarkupHelper.createTable(a);

			test.pass(m);
			
			test = extent.createTest("Login test case six");
			test.log(Status.PASS, createlink());
			
			test = extent.createTest("Login test case video");
			test.log(Status.PASS, createvideo());
			
			test = extent.createTest("Login test case youtube");
			test.log(Status.PASS, createyoutube5());
			
	  extent.flush();
	  System.out.println("Report Generated");
  }
  
  public static String createlink(){
	  String code = "https://www.youtube.com/watch?v=WdenIgyGDyw";
	  
	  String mod="<a href="+code+">Latest Video</a>";
	return mod;
	  
  }
  
  public static String createvideo(){
	  String code = "https://www.youtube.com/watch?v=WdenIgyGDyw";
	  
	  String mod="<video width=\"668\" height=\"514\" controls>"
	  		+ "<source src=\"L:/Abstract.mp4\" type=\"video/mp4\">"
	  						+ "Your browser does not support the video tag."
	  						+ "</video>";
	return mod;
	  
  }
  
  public static String createyoutube(){
	  String code = "https://www.youtube.com/watch?v=WdenIgyGDyw";
	  
	  String mod="<p>Naveen Automation Labs.</p>"
	  		+ "<iframe width=\"500\" height=\"320\" src=\"https://www.youtube.com/embed/lcZDWo6hiuI\">"
	  			+"</iframe>";
	return mod;
	  
  }
  
  public static String createyoutube5(){
	  String code = "https://www.youtube.com/watch?v=WdenIgyGDyw";
	  
	  String mod="<video src="+code+" controls>"
	  		+ "<p>Your browser doesn't support HTML5 video. "
	  		+ "Here is a <a href="+code+">link to the video</a> instead.</p> "
	  		+ "</video>";
	return mod;
	  
  }
  
}
