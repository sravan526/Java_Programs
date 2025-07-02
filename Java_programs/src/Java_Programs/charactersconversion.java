package Java_Programs;

public class charactersconversion
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Annam Sravan Kumar");
		conopp(sb);
		
		System.out.println(sb);
	}
	
	public static void conopp(StringBuffer str)
	{
		
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			Character c=str.charAt(i);
			if(Character.isLowerCase(c))
			{
				str.replace(i, i+1, Character.toUpperCase(c)+"");
			
		   }
			else
			{
				
				str.replace(i,i+1,Character.toLowerCase(c)+"");
			}
			}
				
		}
		
		
		

		
		
		
	}


