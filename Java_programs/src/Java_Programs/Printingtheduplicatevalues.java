package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class Printingtheduplicatevalues
{

	public static void main(String[] args)
	{
		
		//String name = "Sravan Kumar";
		//DupChars(name);
		
		Printingtheduplicatevalues s=new Printingtheduplicatevalues();
		s.DupChars("Sravan KumarS");

	}
	public  void DupChars(String name)
	{
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		char[] carray=name.toCharArray();//s r a v a n
	
		for(char c:carray)
		{
			
			if(m.containsKey(c))
			{
				
				m.put(c, m.get(c)+1);
				
			}
			else {
				m.put(c,1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:m.entrySet())
		{
			if(entry.getValue()>1)
			{
			System.out.println(entry.getKey()+":"+entry.getValue());	
		    }
		}
	}
}

