//Day-1 Reverse a String Program Without using String Buffer/String Builder
package Challenge_30Days;

public class Challenge_1
{
	
	
	public static void main(String[] args)
	{
		String str = "Automation Tester";
		System.out.println("Before Return: "+str);
		
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		System.out.println("After Return: "+temp);
	}

	

}
