//Day-5 Count Vowels in a String in Java
package Challenge_30Days;

import java.util.Arrays;
import java.util.List;

public class Challenge_5
{
	static int FindVowels(String str)
	{
		str = str.replaceAll("\s","").toLowerCase();
		List<Character> Vowels = Arrays.asList('a','e','i','o','u');
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			if(Vowels.contains(str.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		String str ="Selenium Automation Selenium Automation Framework";
		System.out.println("Input string is " +str);
		int VowelsCount = FindVowels(str);
		System.out.println("Total number of vowels in string are:" +VowelsCount);

	}

}
