package Qe;

public class Order
{

	public static void main(String[] args)
	{
		int arr[]= {3,0,2,5,0,3,9,0,0,3,0,5};
		pushZero(arr,arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	static void pushZero(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
			if(arr[i]!=0)
		
			arr[count++]=arr[i];
		      	
			while(count<n)
				arr[count++]=0;
		
	}

}
