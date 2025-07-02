/* Write a Java Program to reverse a string without using String inbuilt function. */
package Java_Programs_for_Interview;

public class Reverse_a_string 
{
	public static void main(String[] args)
	{
		String str = "Automation testing";
		System.out.println(str);
		System.out.println(str.charAt(7));
		System.out.println(str.charAt(11));
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
		String s2 = """
				Hello world
				I am a Java Programmer
				Learning Automation testing
				""";
		System.out.println(s2);
		
	}
	
}
