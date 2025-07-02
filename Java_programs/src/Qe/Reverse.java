package Qe;

public class Reverse
{

	public static void main(String[] args)
	{
		

		/*
		 * String name = "Sravan#$%$Kumar^"; String temp="";
		 */
	

	}
	
	public static void reverse(char str[],int l1,int r1)
	{
		for(int i1=l1;i1<r1/2;i1++)
		{
			char t=str[i1];
			str[i1]=str[r1 -1 -i1];
			str[r1 -1 -i1]=t;
		}
		
		
	}
	
	public static void reversestr(char str[])
	{
		/*
		 * char[] t=new char[str.length]; int x1=0;
		 * 
		 * for(int i1=0;i1<str.length;i1++) { if(str[i1]>='a') {
		 * 
		 * } }
		 */
		
	}

}
