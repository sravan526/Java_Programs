//Day-4 Count Occurrences of Each Word in a String
package Challenge_30Days;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge_4
{

	@SuppressWarnings({ "rawtypes", "unused" })
	static void CountOfOccurrences(String str)
	{
		List<String> wordslist = Arrays.asList(str.split("\s+"));
		HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
		
		char[]strArray = str.toCharArray();
		for(String s: wordslist)
		{
			if(charCountMap.containsKey(s))
			{
				charCountMap.put(s, charCountMap.get(s)+1);
			}
			else
			{
				charCountMap.put(s ,1);
			}
		}
		System.out.println("OUTPUT: ");
		for(Map.Entry entry:charCountMap.entrySet())
		{
			
			System.out.println("Word :"+entry.getKey()+",Count:" +entry.getValue());
		}
	}

	public static void main(String[] args)
	{
		String str ="My name is Sravan Kumar Sravan Kumar is  Autoamtion tester ";
		CountOfOccurrences(str);
	}


}
