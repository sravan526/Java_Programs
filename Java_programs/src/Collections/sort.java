package Collections;

import java.util.Arrays;

public class sort
{

	public static void main(String[] args)
	{
		int [] array = {10,30,50,20,40};
		
		System.out.println("Before sorting the array is");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
			
		}
		
		Arrays.sort(array);
		
		System.out.println("");
		System.out.println("after sorting the array is" );
		System.out.println(Arrays.toString(array));
		
		

	}

}
