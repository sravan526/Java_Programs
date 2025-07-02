package Collections;

import java.util.Arrays;

public class arrayList
{

	public static void main(String[] args)
	{
		
		int [] array = {10,40,30,20};
		System.out.println("Elements of the original array" );
		
		for(int i=0;i<array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}
		
		Arrays.sort(array);
		System.out.println("");
		
		System.out.println("after sorting the arrays in ascending order" +Arrays.toString(array));
		
		
		
		
		
		
	}
				
}
