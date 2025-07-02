package Java_Programs;

import java.util.LinkedHashSet;

public class sample
{
	public static void main(String[] args)
	{
	String name= "sravan";
	
	removeDuplicates(name);

	int n1=0,n2=1;
	int n3,i,count=10;

	System.out.print(n1+" "+n2);
	
	for(i=2;i<count;++i)
	{
		
		n3=n1+n2;
		
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}
		
	
	
	
	}
   public static void removeDuplicates(String str)
   {
	   LinkedHashSet<Character> set=new LinkedHashSet<>();
	   
	   for(int i=0;i<str.length();i++)
	   {
		   
		   set.add(str.charAt(i));
	   }
	   
	   for(Character ch:set)
	   {
		   System.out.print(ch);
	   }
	  
   }
   
  
   
}

