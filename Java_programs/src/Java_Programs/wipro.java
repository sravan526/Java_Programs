package Java_Programs;

import java.util.*;

public class wipro
{
	
	public static void main(String[] args)
	{
	Integer[] a= {10,50,20,40,30};
	
	System.out.print(GetLargest(a, 5));
	
	
	
	
	
	}


public static int GetLargest(Integer[] a ,int total) {
	
	List<Integer> list=Arrays.asList(a);
	Collections.sort(list);

	int element=list.get(total-1);
	return element;
	
}
}
