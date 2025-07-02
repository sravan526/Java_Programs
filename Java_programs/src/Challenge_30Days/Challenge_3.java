//Day-3 Counting the Occurrences of Each Characte
package Challenge_30Days;

import java.util.HashMap;
import java.util.Map;

public class Challenge_3
{
	@SuppressWarnings("rawtypes")
	public static void charactercount(String str)
	{
		str=str.replaceAll("\s","").toLowerCase();
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[]strArray = str.toCharArray();
		for(char c: strArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c ,1);
			}
		}
		System.out.println("OUTPUT: ");
		for(Map.Entry entry:charCountMap.entrySet())
		{
			
			System.out.println("Character :"+entry.getKey()+",Count:" +entry.getValue());
		}
	}

	public static void main(String[] args)
	{
		charactercount("My name is Sravan Kumar");
	}

}
