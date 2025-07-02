package hands_on;

import java.util.Scanner;

public class Check_Divisiblity
{

	public static void main(String[] args)
	{
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		System.out.println("X value is "+x);
		
		if(x%5==0)
		{
			System.out.println("This is divisible number");
		}
		else
		{
			System.out.println("This is not divisible number");
		}

	}

}
