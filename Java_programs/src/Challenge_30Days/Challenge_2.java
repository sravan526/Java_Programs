//Day-2 Reverse a String word by word

package Challenge_30Days;

public class Challenge_2
{
	public static String Reversestringword(String str)
	{
		System.out.println("Before String: "+str);
		if(str == null) return null;
		String temp="";
		String[] strlist=str.split("");
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+strlist[i];
		}
		System.out.println("After String: "+temp);
		return temp;
	}

	public static void main(String[] args)
	{
		Reversestringword("I am Automation tester");

	}

}
