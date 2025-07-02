package Java_Programs;

import java.util.Scanner;

public class swapping_3rdVariable
{
	public static void main(String [] args)
	{
		int x , y,temp;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("before swap x value is" +x);
		System.out.println("before swap y value is" +y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("after swap x value" +x);
		System.out.println("after swap y value" +y);
	}
}
