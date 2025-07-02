package Java_Programs;

public class ReverseastringCharacters1 {

	public static void main(String[] args) 
	{
		String str = "Toohith";
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=str.charAt(i);
		}
		System.out.println(temp);

	}

}
