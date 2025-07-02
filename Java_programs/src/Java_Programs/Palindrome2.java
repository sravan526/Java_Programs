package Java_Programs;

public class Palindrome2
{

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args)
	{
		String str="MALAYALAM";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		StringBuilder x = sb.reverse();
		
		 if (str.equals(x)) 
	        {
	            System.out.println("This is palindrome");
	        }
	        else
	        {
	        	System.out.println("Not palindrome");
	        }
        
    

	}

}
