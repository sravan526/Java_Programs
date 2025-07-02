package Java_Programs;

public class swapingStrings
{
	public static void main(String[]args)
	{
		
		String fname= "Good";
		String lname= "Morning";
		
		 System.out.println("Before swap fname is" +fname);
	     System.out.println("Before swap lanme is" +lname);
		
		
		fname=fname+lname;
		
		lname=fname.substring(0,(fname.length()-lname.length()));
		
        fname= fname.substring(lname.length());
        
        System.out.println("After swap fname is" +fname);
        System.out.println("After swap lanme is" +lname);
                
                
                

	}
}