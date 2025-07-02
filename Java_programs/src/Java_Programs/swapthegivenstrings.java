package Java_Programs;

public class swapthegivenstrings
{
	public static void main(String[]args)
	{
		
		String fname="Sravan";
		String lname="Kumar";

				fname =fname+lname;

               lname=fname.substring(0,fname.length()-lname.length());

               fname=fname.substring(lname.length());

                System.out.println(fname);
                System.out.println(lname);

	}
}