package Java_Programs;

import java.util.Scanner;

public class swapping
{

	public static void main(String[] args)
	{
		int x,y;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
				x =sc.nextInt();
				y =sc.nextInt();
				
				System.out.println("Before swap x value is" +x);
				System.out.println("Before swap y value is" +y);
				
				x=x+y;
				y=x-y;
				x=x-y;
				
				System.out.println("After swap x value is" +x);
				System.out.println("After swap y value is" +y);
				
				
		

	}

}
