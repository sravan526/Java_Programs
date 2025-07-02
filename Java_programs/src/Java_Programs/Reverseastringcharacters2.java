package Java_Programs;

import java.util.Scanner;

public class Reverseastringcharacters2 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//String str = "Gowtham";
		String str =sc.next();
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		System.out.println(temp);
	}

}
