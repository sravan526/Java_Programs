package hands_on;

import java.util.Scanner;

public class Equal_Integer
{

	public static void main(String[] args)
	{
		int x,y;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x == y)
		{
			System.out.println("x and y values are same" +x +" " +y);
		}
		else
		{
			System.out.println("x and y values are not same" +x + " " +y);
		}
		
		

	}

}
