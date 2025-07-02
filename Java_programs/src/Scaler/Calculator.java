package Scaler;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
				int P = sc.nextInt();	//Prinicple amout is =100
				int	t = sc.nextInt() ;	//interest is =5
				int r = sc.nextInt();	//rate is =2
				
				int SI=(P*t*r)/100;		//Simple Interest
				System.out.println("Simple Interest is " +SI);
	}

}
