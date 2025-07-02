package Qe;

public class RemoveSpecialCharacterExample1  
{  
	public static void main(String args[])   
	{  
		String str= "Sravan&*%$#@Kumar";   
		str = str.replaceAll("[^a-zA-Z0-9]", "");  
		System.out.println(str); 
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
		/*
		 * for(int i=str.length()-1;i>=0;i--) {
		 * 
		 * char c=str.charAt(i); System.out.print(c); }
		 */
		
	}  
} 
