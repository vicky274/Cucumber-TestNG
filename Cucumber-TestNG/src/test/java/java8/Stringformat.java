package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

import com.google.common.html.HtmlEscapers;

public class Stringformat {

	public static void main(String[] args) {
		
		//This will normalize the spacing to single and will strip off the starting and trailing whitespaces as well.
		String text = StringUtils.normalizeSpace("this is     used to normalize space");
		System.out.println(text);
		
		String tex="this is     used to normalize space";
		
		//another way
		System.out.println(tex.replaceAll("\\s{2,}", " "));
		
		//another way
		String repl = Pattern.compile("\\s{2,}").matcher(tex).replaceAll(" ");
		System.out.println(repl);
		
		
		
		
		
		long a=000000111;
		
		System.out.println(String.format("%1d", a));

        int num = 7044; 
  
        // Output is 3 zero's("000") + "7044", 
        // in total 7 digits 
        String gfg3 = String.format("%07d", num); 
        System.out.println(gfg3); 
        
       /* String s = "006";
        s = s.replaceFirst ("^0{2}", "");
        System.out.println(s);*/
		
		System.out.println("--------------------UnEscape Characters in HTML ---------------");
		List<String>  list = new ArrayList<String>();
		list.add("addresss");
		list.add("address1 189, &lt;12334&lt;");
		list.add("address1 129, (12335664)");
		list.add("address1 18119, <1233433>");
		
		for(String s: list){
			/*if(s.contains(";")){
				System.out.println("it contains semi-colon "+s);
		        String s1 = s.split(";")[1];
		        System.out.println(s1);
		        String s2 = s1.replaceAll("\\W+", "").trim();
		        System.out.println(s2);
				
			}*/
			/*if(s.contains("<")){
				System.out.println("it contains open arrow "+s);
		        String s1 = s.split("<")[1];
		        System.out.println(s1);
		        String s2 = s1.replaceAll("\\W+", "").trim();
		        System.out.println(s2);
				
			}*/
			if(s.contains("(")){
				System.out.println("it contains open brace "+s);
		        String s1 = s.split("\\(")[1];
		        System.out.println(s1);
		        String s2 = s1.replaceAll("\\W+", "").trim();
		        System.out.println(s2);
				
			}
			else{
				continue;
			}
		}
		//List<String> filterlist = list.stream().filter((String t) -> t.contains("<")).map(x -> x.split("<")[1].replaceAll("\\W+", "").trim()).peek(System.out::println).collect(Collectors.toList());
        
		//unescape html code - commons-lang.jar
		
		//String ss="&amp;nbsp; &amp;nbsp;";
		String ss = StringEscapeUtils.unescapeHtml3("&amp;nbsp; &amp;nbsp;");
		System.out.println(ss.replaceAll("&"+"nbsp;", " ")); 
		
		
		System.out.println(StringEscapeUtils.unescapeJava("\\u00A0"));
		
		String unescaped = StringEscapeUtils.unescapeHtml4("address1 189, &lt;12334&gt;");
		System.out.println(unescaped);
		
		
		//just replace the slash and get escaped value
String str="";
		String myString = "\u0027\u0028\u0030 World";
	
		str = myString.replace("\\","");
		System.out.println("String is :"+str);
		
		
		
		System.out.println(StringEscapeUtils.unescapeJava("\\u0027"));
		
		
        
	}

}
