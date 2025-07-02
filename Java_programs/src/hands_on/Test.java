package hands_on;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test
{
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	    public static void main(String[] args) {
	    
	         String str="Virtusa123";
	        
	         String regex="\\d+";
	         
	         Pattern p=Pattern.compile(regex);
	         
	         Matcher m=p.matcher(str);
	         
	         String s=m.replaceAll("");

	         System.out.println(s);        
	        
	    
	}

}
