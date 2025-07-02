package Scaler;

import java.util.Scanner;

public class challenge_2 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int savings= sc.nextInt();
		int spent = sc.nextInt();
		
		int remainingfinalamount = (savings-spent);
		System.out.println(remainingfinalamount);
	}

}
