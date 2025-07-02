package hands_on;

import java.util.Scanner;

public class positive_Negitive
{
	public static void main(String[] args)
	{
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		if(x>0)
		{
			System.out.println("This is positive number");
		}
		else if(x<0)
		{
			System.out.println("This is negitive number");
		}
	}
}
