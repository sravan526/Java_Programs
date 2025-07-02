package hands_on;

import java.util.Scanner;

public class Given_Integer_is_Odd_or_Even
{

	public static void main(String[] args)
	{
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		if(x%2==0)
		{
			System.out.println("this is even number");
		}
		else
		{
			System.out.println("this is odd number");
		}
	}

}
