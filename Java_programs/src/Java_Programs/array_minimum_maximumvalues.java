package Java_Programs;

public class array_minimum_maximumvalues {

	public static void main(String[] args) 
	{
		int arr[]= {100,25,12,25,26,-1};
		
		int max=0,min=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min:	"+min+ "\nMax:	"+max);
		
		

	}

}
