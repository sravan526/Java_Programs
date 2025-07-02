package hands_on;

import java.util.Scanner;

public class Find_Largest_number
{

	public static void main(String[] args)
	{
		int x,y,z;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y&&x>z)
		{
				System.out.println("x is Largest number");
		}
		else if(y>z) 
		{
			System.out.println("y is Largest number");
		}
		else
		{
			System.out.println("z is Largest number");
		}
	}

}
